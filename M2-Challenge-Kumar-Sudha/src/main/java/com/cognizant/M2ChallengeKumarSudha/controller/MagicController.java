package com.cognizant.M2ChallengeKumarSudha.controller;

import com.cognizant.M2ChallengeKumarSudha.dao.Answer;
import com.cognizant.M2ChallengeKumarSudha.dao.Question;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
@RestController
public class MagicController {
    private static int answerId = 1;

    private static List<Answer> magic8BallAnswers = new ArrayList<>(Arrays.asList(
            /*Reference - Quotes taken from public domain
            https://fortunetellingplus.com/magic-8-ball.html
             */
            new Answer(answerId++,"", "It is certain."),
            new Answer(answerId++, "", " You may rely on it"),
            new Answer(answerId++, "", "As I see it, yes."),
            new Answer(answerId++, "", "Outlook good."),
            new Answer(answerId++, "", "Concentrate and ask again"),
            new Answer(answerId++, "", "Better not tell you now"),
            new Answer(answerId++, "", "Reply hazy, try again."),
            new Answer(answerId++, "", "My reply is no."),
            new Answer(answerId++, "", "Outlook not so good."),
            new Answer(answerId++, "", "My sources say no")

    ));


    public MagicController() {
    }

    @RequestMapping(value ="/magic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public Answer getMagic8BallAnswer(@RequestBody  Question question) {
        /*
        Random number java logic from
        https://howtodoinjava.com/java/generate-random-numbers/
         */
        Answer magic8BallAnswer;
        Random randomGenerator = new Random();
        int randomInteger = randomGenerator.nextInt(magic8BallAnswers.size());
        magic8BallAnswer = magic8BallAnswers.get(randomInteger);
        magic8BallAnswer.setQuestion(question.getQuestion());
        return magic8BallAnswer;
    }
}
