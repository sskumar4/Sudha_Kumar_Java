package com.cognizant.M2ChallengeKumarSudha.controller;

import com.cognizant.M2ChallengeKumarSudha.dao.Definition;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class WordController {
    private static int wordId = 1;
    /*Reference - Words taken from internet
   https://www.vocabulary.com/lists/171713            */
    private static List<Definition> wordAndDefinitionList = new ArrayList<>(Arrays.asList(
            new Definition(wordId++, "mendicant", "a pauper who lives by begging"),
            new Definition(wordId++, "meretricious", "tastelessly showy"),
            new Definition(wordId++, "vitiate", "make imperfect"),
            new Definition(wordId++, "vapid", "lacking significance or liveliness or spirit or zest"),
            new Definition(wordId++, "ruddy", "inclined to a healthy reddish color"),
            new Definition(wordId++, "bourgeois", "being of the property-owning class"),
            new Definition(wordId++, "augur", "predict from an omen"),
            new Definition(wordId++, "prosaic", "lacking wit or imagination"),
            new Definition(wordId++, "profligate", "unrestrained by convention or morality\n"),
            new Definition(wordId++, "hoary", "having gray or white hair as with age")
    ));

    @GetMapping(value = "/word")
    @ResponseStatus(value = HttpStatus.OK)
    public Definition getRandomWordAndItsDefinition() {
        /*
        Random number java logic from
        https://howtodoinjava.com/java/generate-random-numbers/
         */
        Random randomGenerator = new Random();
        int randomInteger = randomGenerator.nextInt(wordAndDefinitionList.size());
        return wordAndDefinitionList.get(randomInteger);

    }
}
