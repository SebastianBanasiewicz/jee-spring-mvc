package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

@Controller
public class FreeTimeController {

    @GetMapping("day-week")
    @ResponseBody
    public String dayOfWeek() {
        Date date = new Date();

        Calendar c = Calendar.getInstance();
        c.setTime(date);

        String dayWeekText = new SimpleDateFormat("EEEE").format(date);
        if (dayWeekText.equals("niedziela")) {
            return dayWeekText + " - wolne";
        }
        return dayWeekText;
    }
}
