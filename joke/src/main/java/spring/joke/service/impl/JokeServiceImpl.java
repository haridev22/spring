package spring.joke.service.impl;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;
import spring.joke.service.JokeService;

@Service
public class JokeServiceImpl implements JokeService {
    ChuckNorrisQuotes quotes;

    public JokeServiceImpl() {
        quotes=new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
