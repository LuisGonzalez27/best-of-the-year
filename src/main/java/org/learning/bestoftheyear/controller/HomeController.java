package org.learning.bestoftheyear.controller;

import org.learning.bestoftheyear.classes.Movie;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping String home(Model model){
        model.addAttribute("name", "Luis");
        return "home";
    }

    @GetMapping("/movies")
    public String viewMovies(Model myMovies){
        List<Movie> movies = getBestMovies();
        myMovies.addAttribute("films", movies);
        return "movies";
    }

    List<Movie> getBestMovies(){

        List<Movie> movies = new ArrayList<Movie>();

        Movie film = new Movie(1, "Saw");
        movies.add(film);

        Movie film2 = new Movie(2, "Megan");
        movies.add(film2);

        return movies;

    }
}
