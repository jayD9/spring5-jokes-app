package jd.springframework.joke.jokeapp.contollers;

import jd.springframework.joke.jokeapp.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author JD
 * created 1/7/21 12:09 AM
 */
@Controller
public class JokeController {

    private JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/")
    public String showJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "chucknorris";
    }

}
