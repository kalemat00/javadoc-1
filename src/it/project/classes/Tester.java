package it.project.classes;

/**
 * This is the tester class
 * inside this class you can find the main method
 * @author Matteo Calenda
 */
public class Tester {
    /**
     * The method main used to run the program
     * @param args don't know what is this
     */
    public static void main(String[] args) {
        WordGames wordGames = new WordGames();
        System.out.println(wordGames.addHelloWorld("world1"));
        System.out.println(wordGames.getFullName("Matteo", "Calenda"));
    }
}
