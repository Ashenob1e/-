package cn.burn.ash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MissController {
    @GetMapping("/miss")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Isma")
                                       String name, ModelMap modelMap) {
        modelMap.put("name", name);
        return "/miss";
    }
}
