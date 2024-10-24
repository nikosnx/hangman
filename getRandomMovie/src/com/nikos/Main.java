package com.nikos;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        //String location = sc.nextLine();
        //String randomMovie = Tools.getRandomMovie(location);
        String randomMovie = Tools.getRandomMovie("./movies.txt");

        Messages messages = new Messages();
        Game game = new Game(randomMovie);
        game.gameInit();
        game.play();


    }
}
