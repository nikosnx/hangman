package com.nikos;

public class Messages {
    public static String progress;
    public static String question;
    public static String wrongLetters;
    public static String win;
    public static String lost;
    public static int badTries;


    Messages() {
        question = "Guess a letter: ";
        progress = "You are guessing: ";
        wrongLetters = "Number of wrong letters guessed: ";
        lost = "You lost!";
        win = "You win, as you see, the movie is called: ";
        int badTries = 0;
        System.out.println("Welcome to the Movie Guessing Game!");
    }

    public void setBadTries(int w) {
        badTries = w;
    }

    public int getBadTries() {
        return badTries;
    }


}
