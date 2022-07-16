package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@RequestMapping("first")
public class FormController {

    @GetMapping("/form")
    public String hello() {
        return "form.jsp";
    }

    @PostMapping("/form")
    @ResponseBody
    public String getNameAndDate(@RequestParam("paramName") String paramName,
                                 @RequestParam("paramDate") String paramDate) {

        LocalDate parseDate = LocalDate.parse(paramDate);

        return "Imię: "
                + paramName
                + ", data: "
                + parseDate;

    }


}
