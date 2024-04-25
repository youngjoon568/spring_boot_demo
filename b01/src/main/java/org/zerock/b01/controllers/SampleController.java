package org.zerock.b01.controllers;
import org.springframework.stereotype.Controller;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import java.util.ArrayList;
import java.util.List;

@Controller
@Log4j2

public class SampleController {
    
    @GetMapping("/hello")
    public void hello(Model model) {

        log.info("hello...............");
        model.addAttribute("msg","Hello, World");
    }

    @GetMapping("ex/ex1")
    public void ex1(Model model) {
        List<String> list = new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");

        model.addAttribute("list", list);
    }
    
}
