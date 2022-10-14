package cz.czechitas.java2webapps.ukol2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class QuotesController {
    private final Random random = new Random();

    @GetMapping("/")
    public ModelAndView quotes(){
        List<String> seznamTextu= List.of("When I wrote this code, only God & I understood what it did." +
                " Now… Only God knows.\n" +
                "Programmer (noun.): A machine that turns coffee into code.\n" +
                "Real programmers count from 0.\n");

        int n = random.nextInt(3);

        ModelAndView nahodneCitaty = new ModelAndView("index");
        nahodneCitaty.addObject("citaty", n-1 );

    return nahodneCitaty;
    }
    }
