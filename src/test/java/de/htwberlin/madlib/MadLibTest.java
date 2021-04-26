package de.htwberlin.madlib;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("MadLib")
class MadLibTest{

    @Test
    @DisplayName("Test 1 MadLib")
    void createSentence () throws Exception {
        MadLib sentence = new MadLib();

        String s = sentence.create();

        if (s != null && s.startsWith("Java programming is so")) {
        } else {
            throw new Exception("Sentence is null or not starting correctly.");
        }
    }

    @Test
    @DisplayName("Test 2 MadLib")
    void createSecondSentence () throws Exception {
        MadLib newSentence = new MadLib();

        String sentence = newSentence.create();

        if (checkString(newSentence.getADJECTIVES(), sentence)==false) {
            throw new Exception("Adjective is missing in the sentence.");
            } else if (checkString(newSentence.getVERBS(), sentence)==false) {
            throw new Exception("Verb is missing in the sentence.");
            } else if (checkString(newSentence.getFamousPersons(), sentence)==false) {
            throw new Exception("Famous person is missing in the sentence.");
        }
    }

    public boolean checkString (String[] word, String sentence) {
        boolean wordIsInString = false;

        for (int i = 0; i < word.length; i++) {
            if (sentence.contains(word[i])) {
                wordIsInString = true;
            }
        }
        return wordIsInString;
    }
}