package jd.springframework.joke.jokeapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * author JD
 * created 1/7/21 12:00 AM
 */
@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
