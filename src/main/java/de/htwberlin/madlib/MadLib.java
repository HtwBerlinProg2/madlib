package de.htwberlin.madlib;

public class MadLib {

  static final String[] ADJECTIVES = new String[]{"amazing", "exciting", "excellent", "emotional", "easy", "difficult", "curious", "beautiful"};
  static final String[] VERBS = new String[]{"concentrate", "compete", "battle", "cry", "develop", "dance", "destroy", "dream", "sleep"};
  static final String[] FAMOUS_PERSONS = new String[]{"Frodo", "Voldemort", "John Wick", "Winnie Pooh", "Thor", "Iron Man", "Hulk", "Supergirl", "Wonder Woman"};

  public String create() {
    // TODO: implement this method
    int i =0;
    int j=0;
    String ad;
    String ver;
    String ver2;
    String fa;
    String sen;

    i = (int)( Math.random()* 7 ) ; ad = getADJECTIVES()[i];
    i = (int)( Math.random()* 8 ) ; ver = getVERBS()[i];
    j = (int)( Math.random()* 8 ) ; if( i ==j){ j = (int) ( Math.random()* 8 );} ver2 = getVERBS()[j];
    i = (int)( Math.random()* 8 ) ; fa = getFamousPersons()[i];

    sen = "Java programming is so "+ ad +"! It makes me so excited all the time because I love to "+ ver+"." +
            " Stay hydrated and "+ver2+" like you are "+fa+"!\n";

    return sen; // TODO: this is only here so that the code can be compiled, please replace it with your result
  }

  public static String[] getADJECTIVES() {
    return ADJECTIVES;
  }

  public static String[] getFamousPersons() {
    return FAMOUS_PERSONS;
  }

  public static String[] getVERBS() {
    return VERBS;
  }
}
