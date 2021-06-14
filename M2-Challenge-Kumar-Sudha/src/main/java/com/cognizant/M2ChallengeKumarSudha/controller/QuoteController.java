package com.cognizant.M2ChallengeKumarSudha.controller;

import com.cognizant.M2ChallengeKumarSudha.dao.Definition;
import com.cognizant.M2ChallengeKumarSudha.dao.Quote;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteController {

    private static int idCounter = 1;

    private static List<Quote> quoteObjectsList = new ArrayList<>(Arrays.asList(
            /*Reference - Quotes taken from internet
            https://wisdomquotes.com/quote-of-the-day/             */
            new Quote(idCounter++,"Eric Hoffer", "The hardest arithmetic to master is that which enables us to count our blessings." +
                    "Your mountain is waiting, so get on your way."),
            new Quote(idCounter++, "Tom Felton", "Whatever life throws at me I'll take it and be grateful for it as well."),
            new Quote(idCounter++, "Jerzy Gregory ", "Hard choices, easy life. Easy choices, hard life."),
            new Quote(idCounter++, "Sharon Begley", "Somewhere, something incredible is waiting to be known."),
            new Quote(idCounter++, "Mary Pickford", "The past cannot be changed. The future is yet in your power"),
            new Quote(idCounter++, "Tony Robbins", "Persistence overshadows even talent as the most valuable resource shaping the quality of life"),
            new Quote(idCounter++, "Henry David Thoreau", "Live your beliefs and you can turn the world around."),
            new Quote(idCounter++, "Napoleon Hill", "Your big opportunity may be right where you are now."),
            new Quote(idCounter++, "Joseph Campbell", "A hero is someone who has given his or her life to something bigger than oneself"),
            new Quote(idCounter++, "Tony Robbins", "It is in your moments of decision that your destiny is shaped." )

    ));


    @GetMapping(value = "/quote")
    @ResponseStatus(value = HttpStatus.OK)
    public Quote getRandomQuoteObject() {
        /*
        Random number java logic from
        https://howtodoinjava.com/java/generate-random-numbers/
         */
        Random randomGenerator = new Random();
        int randomInteger = randomGenerator.nextInt(quoteObjectsList.size());
        return quoteObjectsList.get(randomInteger);

    }

}
