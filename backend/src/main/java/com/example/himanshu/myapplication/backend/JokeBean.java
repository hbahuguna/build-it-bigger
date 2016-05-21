package com.example.himanshu.myapplication.backend;


import com.udacity.example.jokes.JokeSmith;

/** The object model for the data we are sending through endpoints */
public class JokeBean {

    private JokeSmith jokeSmith;

    public JokeBean() {
        jokeSmith = new JokeSmith();
    }

    public String getJoke() {
        return jokeSmith.getRandomJoke();
    }
}