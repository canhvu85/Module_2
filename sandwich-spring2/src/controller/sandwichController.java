package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class sandwichController {
    @GetMapping("/home")
    public String show(){
        return "save";
    }

    @PostMapping("/save")
    public String save(@RequestParam("cond") String[] cond, Model model) {

            model.addAttribute("cond", cond);
            return "show";
    }
}
