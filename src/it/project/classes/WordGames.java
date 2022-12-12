package it.project.classes;

/**
 * This is the WordGames class
 * it can be used with two simple method
 * @author Matteo Calenda
 */
public class WordGames {
    /**
     *This method return a String made up of a String "Hello "
     * plus whatever is contained in the param world
     * @param world a String variable
     * @return return a String
     */
    public String addHelloWorld(String world){
        return "Hello " + world;
    }

    /**
     * This method take as param two String
     * and return a String that contain both
     * @param name the String name
     * @param surname the String surname
     * @return return a String
     */
    public String getFullName(String name, String surname){
        return name + " " + surname;
    }
}
