package de.htwberlin.madlib;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MadLibTest {
    static final String[] ADJECTIVES = new String[]{"amazing", "exciting", "excellent", "emotional", "easy", "difficult", "curious", "beautiful"};
    static final String[] VERBS = new String[]{"concentrate", "compete", "battle", "cry", "develop", "dance", "destroy", "dream", "sleep"};
    static final String[] FAMOUS_PERSONS = new String[]{"Frodo", "Voldemort", "John Wick", "Winnie Pooh", "Thor", "Iron Man", "Hulk", "Supergirl", "Wonder Woman"};

    @Test
    @DisplayName("should check the inserted variables")
    public void createTest() {
        MadLib p = new MadLib();
        String expected = "Java programming is so "+ Arrays.toString(ADJECTIVES) +"! It makes me so excited " +
                "all the time because I love to "+ Arrays.toString(VERBS) +"." +
                " Stay hydrated and "+ Arrays.toString(VERBS) +" like you are "+ Arrays.toString(FAMOUS_PERSONS) +"!\n";
        String actual = p.create();
        assertEquals(expected, actual);
    }


    @Test
    @DisplayName("should check the inserted variables")
    public void createTest2() {
        MadLib p = new MadLib();
        String expected = "Java programming is so ";
        String actual = p.create();
        assertTrue(actual != null && actual.contains(expected));
    }

   /* @ParameterizedTest
    @ValueSource(strings = "Java programming is so")
    public void createTest3(String ex) {
        MadLib p = new MadLib();
        String actual = p.create();
        assertTrue( actual != null && actual.contains("Java programming is so"));

    }*/
}