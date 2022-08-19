package de.sheeperich.sfg.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class ChuckNorrisQuoteService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;


    public ChuckNorrisQuoteService() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getRandomJoke(){
        return this.chuckNorrisQuotes.getRandomQuote();
    }
}
