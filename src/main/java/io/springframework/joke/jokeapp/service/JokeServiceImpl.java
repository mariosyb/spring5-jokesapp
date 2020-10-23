/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.springframework.joke.jokeapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 *
 * @author msulbara
 */
@Service
public class JokeServiceImpl implements JokeService {
    
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    // de esta forma hacemos que la variable se inicialice una sola vez
    // y Spring no recree el objeto multiples veces
    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }
    
    

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }

}
