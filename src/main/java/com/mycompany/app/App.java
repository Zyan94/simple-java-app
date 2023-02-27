package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Dummy String";

    public App() {}

    public static void main(String[] args) {
        System.out.println("Hello there ! I am simple Java app");
        System.out.println("Jenkins is awesome");
        System.out.println("This training is so exciting!");
    }

    public String getMessage() {
        return MESSAGE;
    }
}
