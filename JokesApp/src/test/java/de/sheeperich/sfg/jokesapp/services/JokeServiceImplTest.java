package de.sheeperich.sfg.jokesapp.services;

import org.junit.jupiter.api.Test;

class JokeServiceImplTest {

    @Test
    void getRandomJoke() {

        JokeServiceImpl cnqs = new JokeServiceImpl();
        System.out.println(cnqs.getRandomJoke());

    }
}