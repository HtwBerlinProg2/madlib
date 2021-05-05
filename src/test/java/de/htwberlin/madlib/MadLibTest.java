package de.htwberlin.madlib;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MadLibTest {
    MadLib testObject = new MadLib();
    @Test
    @DisplayName("The result string should starts with \"Java programming is so\" ")
    void startWithPattern() {
        String expectedStartWith = "Java programming is so";
        boolean actual = testObject.create().startsWith(expectedStartWith);
        assertEquals(true,actual);
    }

    @Test
    @DisplayName("Should contains adjective from ADJECTIVES array, verbs from VERBS array, and famous person from FAMOUS-PERSONS")
    void containRequiredWords(){
        String returnString = testObject.create();
        boolean expected = true;
        boolean actual1 = Arrays.stream(MadLib.ADJECTIVES).anyMatch(i -> returnString.contains(i));
        boolean actual2 = Arrays.stream(MadLib.VERBS).anyMatch(i -> returnString.contains(i));
        boolean actual3 = Arrays.stream(MadLib.FAMOUS_PERSONS).anyMatch(i -> returnString.contains(i));
        boolean actual = actual1 && actual2 && actual3;
        assertEquals(expected,actual);
    }
}