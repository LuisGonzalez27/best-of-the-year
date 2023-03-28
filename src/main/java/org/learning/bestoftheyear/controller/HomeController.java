package org.learning.bestoftheyear.controller;

import org.learning.bestoftheyear.classes.Movie;

import org.learning.bestoftheyear.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/songs")
    public String viewSongs(Model mySongs){
        List<Song> songs = getBestSongs();
        mySongs.addAttribute("songs", songs);
        return "songs";
    }

    @GetMapping("/movies/{id}")
    public String idMovie(Model model,@PathVariable("id") String id) {
        List<Movie> movies = getBestMovies();
        model.addAttribute("movie", movies.get(Integer.parseInt(id) -1));
        return "movie";
    }

    @GetMapping("/songs/{id}")
    public String idSong(Model model,@PathVariable("id") String id) {
        List<Song> songs = getBestSongs();
        model.addAttribute("song", songs.get(Integer.parseInt(id) -1));
        return  "song";
    }

    private List<Movie> getBestMovies(){

        List<Movie> movies = new ArrayList<Movie>();

        movies.add(new Movie(1, "Saw"));

        movies.add(new Movie(2, "Megan"));

        movies.add(new Movie(3, "Get Out"));

        movies.add(new Movie(4, "The Babadook"));

        movies.add(new Movie(5, "Watcher"));

        return movies;

    }

    private List<Song> getBestSongs(){

        List<Song> songs = new ArrayList<Song>();

        songs.add(new Song(1, "We Will Rock You"));

        songs.add(new Song(2, "Don't Stop Me Now"));

        songs.add(new Song(3, "Radio Ga Ga"));

        songs.add(new Song(4, "I Want to Break Free"));

        songs.add(new Song(5, "Another One Bites the Dust"));

        return songs;

    }
}
