package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class NameController {

    @GetMapping("hello/{firstName}/{lastName}")
    @ResponseBody
    public String helloFullName(@PathVariable("firstName") String firstName,
                                @PathVariable("lastName") String lastName){

        return "Witaj "
                + firstName
                + " "
                + lastName;
    }
}
