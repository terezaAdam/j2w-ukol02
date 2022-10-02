package cz.czechitas.java2webapps.ukol2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Random;

@Controller
public class QuotesController {
    private Random random = new Random();
    String seznamCitatu = ("I have a joke on programming but it only works on my computer.\n" +
            "99 little bugs in the code, 99 bugs in the code. Take one down, patch it around. " +
            "127 little bugs in the code…\n" +
            "When I wrote this code, only God & I understood what it did. Now… Only God knows.\n" +
            "Programmer (noun.): A machine that turns coffee into code.\n" +
            "Real programmers count from 0.");
    int n = 5;
    int citaty = random.nextInt(n-1);

    @GetMapping("/citat")
    public ModelAndView quotes(){

        ModelAndView nahodneCitaty = new ModelAndView("index");
        nahodneCitaty.addObject("citaty", citaty);
        nahodneCitaty.addObject("obrazek1", citaty<=-1);

    return nahodneCitaty;
    }
    }
