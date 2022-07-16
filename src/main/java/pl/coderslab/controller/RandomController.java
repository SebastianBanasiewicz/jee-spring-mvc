package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class RandomController {

    @GetMapping("show-random")
    @ResponseBody
    public String showRandom() {
        Random r = new Random();
        int a = r.nextInt(100) + 1;
        return "Wylosowano liczbe: " + a;
    }

    @GetMapping("random/{max}")
    @ResponseBody
    public String generateRandomWithMax(@PathVariable("max") int max) {
        int rand = new Random().nextInt(max) + 1;
        return "Użytkownik podał wartość: "
                + max
                + ", wylosowano liczbę: "
                + rand;
    }

    @GetMapping("random/{min}/{max}")
    @ResponseBody
    public String generateRandomWithMax(@PathVariable("min") int min,
                                        @PathVariable("max") int max) {
        int rand = new Random().nextInt(max - min) + min;
        return "Użytkownik podał wartości: "
                + min
                + "-"
                + max
                + ", wylosowano liczbę: "
                + rand;
    }
    
}
