package pl.coderslab.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MultiplyController {

    @GetMapping("multiply/{size}")
    public String multiply(Model model, @PathVariable("size") int size) {

        model.addAttribute("size", size);

        return "multiply";
    }
}
