package com.oleg24.funfacts;

import java.util.Random;

/**
 * Created by oleg on 12/16/14.
 */
public class FactBook {

    public String[] mFacts = {
            "Demarcus Cousins is the best center in NBA",
            "Darren Collison once crossed over CP3 so hard he needed to buy All State ankle insurance",
            "Kings should not have fired Mike Malone", "Most fun facts are just B.S.",
            "The weather in SF hasn't been so bad this year.",
            "I'm flying to Keyna January 8th",
            "I will be stopping in Amsterdam on the way there.",
            "There are only 5 white rhinos left in the world"
    };


    public String getFact(){

        String fact = "";
        // Randomly select a fact
        Random randomGenerator = new Random();

        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];

        return fact;
    }
}
