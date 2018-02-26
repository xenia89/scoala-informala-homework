package hangman;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SameLetterException {

        Scanner userInput = new Scanner(System.in);
        WordList inputWord = new WordList();
        String myWord = inputWord.getRandomWord();
        /* Daca vrem sa vedem ce cuvant am ales, decomentam randul de mai jos
        System.out.println(myWord.toString());
         */
        HangmanGame firstWord = new HangmanGame(myWord);
        int nrTRies = 0;
        while (!firstWord.printGame()) {
            {
                System.out.println();
                System.out.println("input a letter");
                String inputChar = userInput.next();
                nrTRies++;
                char inputCharacter = inputChar.charAt(0);
                if (firstWord.isSameLetter(inputCharacter)) {
                    System.out.println("diferent letters");
                    continue;
                }
                firstWord.addLetter(inputCharacter);
            }
        }
        if (nrTRies < myWord.length() * 2) {
            System.out.println("Game is won!");
        } else {
            System.out.println();
            System.out.println("you guessed the word but you lost(too many tries)");
        }
    }
}
