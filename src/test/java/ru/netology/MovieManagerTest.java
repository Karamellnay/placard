package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test
    public void noFilms() {
        MovieManager manager = new MovieManager();
        String[] actual = manager.findAll();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void oneFilm() {
        MovieManager manager = new MovieManager();
        manager.add("Film one");
        String[] actual = manager.findAll();
        String[] expected = { "Film one" };
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void someFilms() {
        MovieManager manager = new MovieManager();
        manager.add("Film one");
        manager.add("Film two");
        manager.add("Film three");
        manager.add("Film four");
        String[] actual = manager.findAll();
        String[] expected = { "Film one", "Film two", "Film three", "Film four" };
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void lastFilmsLessFive() {
        MovieManager manager = new MovieManager();
        manager.add("Film one");
        manager.add("Film two");
        manager.add("Film three");
        manager.add("Film four");
        String[] actual = manager.findLast();
        String[] expected = { "Film four", "Film three", "Film two", "Film one" };
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void lastFilmsFive() {
        MovieManager manager = new MovieManager();
        manager.add("Film one");
        manager.add("Film two");
        manager.add("Film three");
        manager.add("Film four");
        manager.add("Film five");
        String[] actual = manager.findLast();
        String[] expected = { "Film five", "Film four", "Film three", "Film two", "Film one" };
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void lastFilmsMoreFive() {
        MovieManager manager = new MovieManager();
        manager.add("Film one");
        manager.add("Film two");
        manager.add("Film three");
        manager.add("Film four");
        manager.add("Film five");
        manager.add("Film six");
        manager.add("Film seven");
        String[] actual = manager.findLast();
        String[] expected = { "Film seven", "Film six", "Film five", "Film four", "Film three" };
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void lastFilmsLimit() {
        MovieManager manager = new MovieManager(3);
        manager.add("Film one");
        manager.add("Film two");
        manager.add("Film three");
        manager.add("Film four");
        manager.add("Film five");
        manager.add("Film six");
        manager.add("Film seven");
        String[] actual = manager.findLast();
        String[] expected = { "Film seven", "Film six", "Film five" };
        Assertions.assertArrayEquals(expected, actual);
    }
}
