package guessingGame;

import javax.swing.*;

public class guessingGame {

    public static void main(String[] args){

        int programNumber = (int)(Math.random()*100 + 1);

        int userAnswer = 0;

        System.out.println("The correct guess would be " + programNumber);

        int count = 1;

        while (userAnswer != programNumber) {
            String response = JOptionPane.showInputDialog(null, "" +
                    "Enter a guess between 1 and 100", "Guessing Game", 3);

            userAnswer = Integer.parseInt(response);

            JOptionPane.showMessageDialog(null,""+ determineGuess(userAnswer,
                    programNumber, count));

            count++;
        }
    }


    public static String determineGuess(int userAnswer, int programNumber, int count) {

        if(userAnswer <= 0 || userAnswer > 100) {
            return "Your guess is invalid";
        } else if(userAnswer == programNumber){
            return "Correct!\nTotal Guesses: " + count;
        } else if(userAnswer > programNumber) {
            return "Your guess is too high, try again.\nTry Number: " + count;
        }else if(userAnswer < programNumber) {
            return "Your guess too low, try again.\nTry Number: " + count;
        }else {
            return "Your guess is incorrect\nTry Number: " + count;
        }
    }
}
