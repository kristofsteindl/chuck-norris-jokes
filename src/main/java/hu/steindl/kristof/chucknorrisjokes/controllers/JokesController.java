package hu.steindl.kristof.chucknorrisjokes.controllers;

import hu.steindl.kristof.chucknorrisjokes.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(name = "/")
public class JokesController {

    private final JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({""})
    public String getOneJoke(Model model) {
        model.addAttribute("joke", jokeService.getOneJoke());
        return "chucknorris";

    }
}
