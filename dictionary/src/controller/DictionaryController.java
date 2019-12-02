package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {
    @GetMapping("/view")
    public String show(){
        return "view";
    }

    @GetMapping("/dictionary")
    public String dictionary(@RequestParam String key, Model model){
        Map<String, String> dict = new HashMap<>();
        dict.put("he", "anh ay");
        dict.put("is", "la");
        dict.put("dog", "con tro");

        String mean = dict.get(key);

        model.addAttribute("mean",mean);

        return "view";
    }
}
