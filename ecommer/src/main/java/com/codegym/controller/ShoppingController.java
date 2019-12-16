package com.codegym.controller;

import com.codegym.model.Order;
import com.codegym.model.OrderDetail;
import com.codegym.model.Product;
import com.codegym.repository.ProductRepository;

import com.codegym.service.OrderDetailService;
import com.codegym.service.ProductService;
import com.codegym.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ShoppingController {
    @Autowired
    ProductService productService;
    @Autowired
    OrderDetailService orderDetailService;
    @GetMapping("/add/{id}")
    public ModelAndView addToCart(@PathVariable Long id, HttpSession session){
        if(id != 0) {
            Order item;
            List<OrderDetail> cart;
            double total = 0;

            if (session.getAttribute("cart") == null) {
                cart = new ArrayList<>();
                Product product = productService.findById(id);
                item = new Order();
                cart.add(new OrderDetail(item, product));
                session.setAttribute("cart", cart);
                session.setAttribute("total", total);
                total = product.getPrice();
            } else {
                cart = (List<OrderDetail>) session.getAttribute("cart");
                int index = this.isExisting(id, cart);
                item = new Order();
                //int index = orderDetailService.isExisting(item, id);
                if (index == -1) {
                    Product product = productService.findById(id);
                    cart.add(new OrderDetail(item, product));
                } else {
                    int quantity = cart.get(index).getQuantity() + 1;
                    cart.get(index).setQuantity(quantity);
                }
                session.setAttribute("cart", cart);
                for (int i = 0; i < cart.size(); i++) {
                    total += cart.get(i).getProduct().getPrice() * cart.get(i).getQuantity();
                }
            }

            ModelAndView modelAndView = new ModelAndView("/orderDetail/cart");
            modelAndView.addObject("cart", cart);
            modelAndView.addObject("total", total);
            return modelAndView;
        }
        ModelAndView modelAndView = new ModelAndView("/orderDetail/cart");
        modelAndView.addObject("cart", session.getAttribute("cart"));
        modelAndView.addObject("total", session.getAttribute("total"));
        return modelAndView;
    }

    public int isExisting(Long id, List<OrderDetail> cart){
        for (int i = 0; i < cart.size(); i++) {
           // total += cart.get(i).getProduct().getPrice() * cart.get(i).getQuantity();
            if(cart.get(i).getProduct().getId() == id)
                return i;
        }
        return -1;
    }
}
