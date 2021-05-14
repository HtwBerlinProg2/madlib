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

    boolean checker (String sen ,String[] spl){
        for(String i : spl)
            if (sen.contains(i)){
                return true;
            }
        return false;
    }


    @Test
    @DisplayName("should check the inserted variables")
    public void createTest() {

        MadLib p = new MadLib();


        String actual = p.create();
        assertTrue(checker(actual, MadLibTest.ADJECTIVES));
        assertTrue(checker(actual, MadLib.VERBS));
        assertTrue(checker(actual, MadLib.FAMOUS_PERSONS));
    }



    @Test
    @DisplayName("should check the inserted variables")
    public void createTest2() {
        MadLib p = new MadLib();
        String expected = "Java programming is so ";
        String actual = p.create();
        assertTrue(actual != null && actual.startsWith("Java programming is so "));
    }

}