package org.learning.bestoftheyear.controller;

import org.learning.bestoftheyear.classes.Movie;

import org.learning.bestoftheyear.classes.Song;
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

    @GetMapping("/songs")
    public String viewSongs(Model mySongs){
        List<Song> songs = getBestSongs();
        mySongs.addAttribute("songs", songs);
        return "songs";
    }

    List<Movie> getBestMovies(){

        List<Movie> movies = new ArrayList<Movie>();

        Movie film = new Movie(1, "Saw");
        movies.add(film);

        Movie film2 = new Movie(2, "Megan");
        movies.add(film2);

        Movie film3 = new Movie(3, "Get Out");
        movies.add(film3);

        Movie film4 = new Movie(4, "The Babadook ");
        movies.add(film4);

        Movie film5 = new Movie(5, "Watcher");
        movies.add(film5);

        return movies;

    }

    List<Song> getBestSongs(){

        List<Song> songs = new ArrayList<Song>();

        Song song = new Song(1, "We Will Rock You");
        songs.add(song);

        Song song2 = new Song(2, "Don't Stop Me Now");
        songs.add(song2);

        Song song3 = new Song(3, "Radio Ga Ga");
        songs.add(song3);

        Song song4 = new Song(4, "I Want to Break Free");
        songs.add(song4);

        Song song5 = new Song(5, "Another One Bites the Dust");
        songs.add(song5);


        return songs;

    }
}
