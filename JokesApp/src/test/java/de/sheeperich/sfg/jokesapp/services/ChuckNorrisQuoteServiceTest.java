package de.sheeperich.sfg.jokesapp.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChuckNorrisQuoteServiceTest {

    @Test
    void getRandomJoke() {

        ChuckNorrisQuoteService cnqs = new ChuckNorrisQuoteService();
        System.out.println(cnqs.getRandomJoke());

    }
}