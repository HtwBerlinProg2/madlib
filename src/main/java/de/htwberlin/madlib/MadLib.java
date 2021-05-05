package de.htwberlin.madlib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MadLib {

  static final String[] ADJECTIVES = new String[]{"amazing", "exciting", "excellent", "emotional", "easy", "difficult", "curious", "beautiful"};
  static final String[] VERBS = new String[]{"concentrate", "compete", "battle", "cry", "develop", "dance", "destroy", "dream", "sleep"};
  static final String[] FAMOUS_PERSONS = new String[]{"Frodo", "Voldemort", "John Wick", "Winnie Pooh", "Thor", "Iron Man", "Hulk", "Supergirl", "Wonder Woman"};

  public String create() {
    // TODO: implement this method
    String random_adjective = randomWordOf(ADJECTIVES);
    String random_verb = randomWordOf(VERBS);
    String other_random_verb = randomWordOf(VERBS);
    String random_famous_person= randomWordOf(FAMOUS_PERSONS);

    String toReturnString = "Java programming is so "
            +  random_adjective
            +" ! It makes me so excited all the time because I love to "
            +  random_verb
            + ". Stay hydrated and "
            +  other_random_verb
            + " like you are "
            +  random_famous_person
            + " !";
    return toReturnString; // TODO: this is only here so that the code can be compiled, please replace it with your result
  }
  private String randomWordOf (String[] targetArray){
    return targetArray[(int)Math.floor(Math.random()*targetArray.length)];
  }

}
