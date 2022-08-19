package de.sheeperich.sfg.jokesapp.controller;

import de.sheeperich.sfg.jokesapp.services.ChuckNorrisQuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final ChuckNorrisQuoteService chuckNorrisQuoteService;

    public JokesController() {
        this.chuckNorrisQuoteService = new ChuckNorrisQuoteService();
    }


    @RequestMapping("/")
    public String getRandomJoke(Model model){
        model.addAttribute("joke", this.chuckNorrisQuoteService.getRandomJoke());
        return "index";
    }

}
