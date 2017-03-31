/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg5;

import java.util.Scanner;

/**
 *
 * @author niralikantaria
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner is created 
        Scanner input = new Scanner(System.in);

        //player 1 and 2
        int player1 = 1;
        int player2 = 2;
        //while loop created 
        while (true) {

            //intro hangman game   
            System.out.println("Welcome to Hangman!");
            //quit game rules
            System.out.println("Press enter to quit the game");
            //player 1 enters in word 
            System.out.printf("Player %s, Enter in a word for player %s to guess.\n", player1, player2);
            String word = input.nextLine();
            //save word 1 as word 
            String word1 = word;
            //number of lives 
            int lives = 5;
            //convert to lower care
            word = word.toLowerCase();

            //create an loop, to system exit the game  
            if (word.isEmpty()) {
                System.out.println("Bye! Thanks");
                System.exit(0);
            }

            //create spaces to make word disappear  
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

            //replace all letter of the word with a "-" 
            word = word.replace("a", "-");
            word = word.replace("b", "-");
            word = word.replace("c", "-");
            word = word.replace("d", "-");
            word = word.replace("e", "-");
            word = word.replace("f", "-");
            word = word.replace("g", "-");
            word = word.replace("h", "-");
            word = word.replace("i", "-");
            word = word.replace("j", "-");
            word = word.replace("k", "-");
            word = word.replace("l", "-");
            word = word.replace("m", "-");
            word = word.replace("n", "-");
            word = word.replace("o", "-");
            word = word.replace("p", "-");
            word = word.replace("q", "-");
            word = word.replace("r", "-");
            word = word.replace("s", "-");
            word = word.replace("t", "-");
            word = word.replace("u", "-");
            word = word.replace("v", "-");
            word = word.replace("w", "-");
            word = word.replace("x", "-");
            word = word.replace("y", "-");
            word = word.replace("x", "-");

            //print out word (spaces)
            System.out.println(word);

            //loop created 
            while (!(word1.equals(word))) {
                //enter in a letter 
                System.out.println("Enter a letter");
                String letter = input.nextLine();

                //if letter is empty then the game exits 
                if (letter.isEmpty()) {
                    System.out.println("Bye! Thanks");
                    System.exit(0);
                }

                //boolean created 
                boolean wrong = false;
                //for loop created to find letter at each position
                for (int i = 0; i < word.length(); i++) {
                    //if the letter entered is correct then add into the final word 
                    if (word1.charAt(i) == letter.charAt(0)) {
                        wrong = true;
                        word = word.substring(0, i) + letter + word.substring(i + 1, word.length());
                    }
                }
                //prints out word 
                System.out.println(word);
                
                //if the boolean is false then they lose a life
                if (wrong == false) {
                    lives--;
                    System.out.println("WRONG!!! You have " + lives + " lives left now.");
                    //if all lives are gone game ends 
                    if (lives == 0) {
                        System.out.println("GAME OVER.");
                        break;
                    }
                }

                //if lives are not lost but he word is found then you win 
                if (!(lives == 0) && word1.equals(word)) {
                    System.out.println("Congarts, YOU WON!!!");
                }

            }

        }
    }
}

