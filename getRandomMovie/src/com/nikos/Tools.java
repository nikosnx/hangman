package com.nikos;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Path.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Tools {
    public static String getRandomMovie(String fileLocation) throws IOException {
        //get line count of the file
        Path path = Paths.get(fileLocation);
        int lines = 0;
        lines = (int) Files.lines(path).count();

        //generate random line number & get String containing it's content
        int randomLine = ThreadLocalRandom.current().nextInt(0, lines + 1); //suppose 1st line 0.
        String selectedLine = Files.readAllLines(path).get(randomLine);
        return selectedLine;
    }

    public static void printResult(String[] arr) { //print array
        for (String s : arr) {
            System.out.print(s);
            System.out.print(" ");
        }
        System.out.println();
    }



}
