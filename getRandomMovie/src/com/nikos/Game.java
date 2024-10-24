package com.nikos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;



public class Game {
     ArrayList<Integer> positions = new ArrayList<Integer>(); //array list containing ints
     String[] resultArray; //table of strings
     String[] movieNameArr; //untouched string with chosen movies name
     char in;
     boolean badTry;

    public Game (String randomMovie) {
        this.movieNameArr = randomMovie.split(" ");
        this.resultArray = movieNameArr.clone();
    }
    public void alterResult() {
        int count = -1;
       for (String s : movieNameArr) { //actual movie name
           count++;
           if ((s.indexOf(in) == -1)) {
               badTry = true;
           }
           else {
               badTry = false;

               for(int i=0; i<s.length(); i++) {
                   if (s.charAt(i) == in)
                       positions.add(i);
               }

               for (Integer position : positions) {
                   StringBuilder sb = new StringBuilder(resultArray[count]);
                   sb.setCharAt(position, in);
                   resultArray[count] = sb.toString();


               }

           }
           positions.clear();
       }
       if (badTry)
           Messages.badTries++;
   }

        public void gameInit() {
            for (int i = 0; i < resultArray.length; i++) {
                    resultArray[i] = "_".repeat(resultArray[i].length());
            }
        }

    public void play() {
        do {
            System.out.println(Messages.progress);
            Tools.printResult(resultArray);
            System.out.print(Messages.wrongLetters);

            System.out.println(Messages.badTries);
            System.out.println(Messages.question);
            Scanner inputScanner = new Scanner(System.in);
            in = inputScanner.next().charAt(0);

            alterResult();
            System.out.println();

        } while (Messages.badTries < 10 && !(Arrays.equals(movieNameArr, resultArray)));

        if (Arrays.equals(movieNameArr, resultArray) ) {

            System.out.println("You found the movie called: ");

            Tools.printResult(movieNameArr);
        } else {
            System.out.println("You lost! No more tries left..");
        }
    }
}








