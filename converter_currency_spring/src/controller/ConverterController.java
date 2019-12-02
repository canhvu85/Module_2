package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConverterController {
    @GetMapping("/view")
    public String show(){
        return "view";
    }
    @GetMapping("/converter")
    public String convert(@RequestParam String usd, Model model){

        int vnd = Integer.parseInt(usd) * 22000;

        model.addAttribute("vnd", vnd);

        return "view";
    }
}
