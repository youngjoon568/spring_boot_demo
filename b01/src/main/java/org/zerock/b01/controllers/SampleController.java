package org.zerock.b01.controllers;
import org.springframework.stereotype.Controller;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
@Log4j2

public class SampleController {
    
    @GetMapping("/hello")
    public void hello(Model model) {

        log.info("hello...............");
        // model.addAttribute("msg","Hello, World");
        model.addAttribute("msg", "Hello, Spring");
    }
    
}
