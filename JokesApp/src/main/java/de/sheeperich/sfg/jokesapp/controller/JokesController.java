package de.sheeperich.sfg.jokesapp.controller;

import de.sheeperich.sfg.jokesapp.services.JokeService;
import de.sheeperich.sfg.jokesapp.services.JokeServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    private final JokeService jokeServiceImpl;

    public JokesController( JokeService jokeService) {
        this.jokeServiceImpl = jokeService;
    }


    @RequestMapping({"/", ""})
    public String getRandomJoke(Model model){
        model.addAttribute("joke", this.jokeServiceImpl.getRandomJoke());
        return "index";
    }

}
