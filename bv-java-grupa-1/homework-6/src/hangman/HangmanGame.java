package hangman;

import java.util.ArrayList;
import java.util.List;

public class HangmanGame {
    protected String word;
    private List<Character> letters = new ArrayList<>();
    private List<Character> misses = new ArrayList<>();

    public HangmanGame(String word) {
        this.word = word;
    }

    public boolean printGame() {
        boolean isGameWon = true;
        for (int i = 0; i < word.length(); i++) {
            if (letters.contains(word.charAt(i))) {
                System.out.print(word.charAt(i) + " ");
            } else {
                System.out.print("_");
                isGameWon = false;
            }
        }
        System.out.println();
        System.out.print("Misses: ");
        printMissing();
        return isGameWon;
    }

    public void printMissing() {
        for (int i = 0; i < letters.size(); i++) {
            if (!word.contains((letters.get(i).toString()))) {
                System.out.print(letters.get(i) + ", ");
            }
        }
    }

    public void addLetter(Character letter) {
        letters.add(letter);
    }

    public boolean isSameLetter(Character letter) throws SameLetterException{
        boolean isLetter=false;
        if(letters.contains(letter)) {
            isLetter=true;
            throw new SameLetterException("You can't input the same letter twice!");
        }
        return isLetter;
    }
}
