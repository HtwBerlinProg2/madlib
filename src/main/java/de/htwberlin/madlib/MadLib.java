package de.htwberlin.madlib;

import java.util.Random;

public class MadLib {

  static final String[] ADJECTIVES = new String[]{"amazing", "exciting", "excellent", "emotional", "easy", "difficult", "curious", "beautiful"};
  static final String[] VERBS = new String[]{"concentrate", "compete", "battle", "cry", "develop", "dance", "destroy", "dream", "sleep"};
  static final String[] FAMOUS_PERSONS = new String[]{"Frodo", "Voldemort", "John Wick", "Winnie Pooh", "Thor", "Iron Man", "Hulk", "Supergirl", "Wonder Woman"};

  public String create() {
    // TODO: implement this method
    Random randomNumber = new Random();

    int randomAdjective = randomNumber.nextInt(ADJECTIVES.length);
    int randomVerb = randomNumber.nextInt(VERBS.length);
    int otherRandomVerb = randomNumber.nextInt(VERBS.length);
    int randomFamousPerson = randomNumber.nextInt(VERBS.length);

    return "Java programming is so " + ADJECTIVES[randomAdjective] + "! It makes me so excited all the time because I love to " + VERBS[randomVerb] + ". Stay hydrated and " + VERBS[otherRandomVerb] +" like you are " + FAMOUS_PERSONS[randomFamousPerson]+"!";
  }

  public static String[] getADJECTIVES() {
    return ADJECTIVES;
  }

  public static String[] getVERBS() {
    return VERBS;
  }

  public static String[] getFamousPersons() {
    return FAMOUS_PERSONS;
  }
}
