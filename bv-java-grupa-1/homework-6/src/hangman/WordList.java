package hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class WordList {
    private List<String> words=new ArrayList<>();
    Random rand=new Random();

    public WordList(){
        words.add("cactus");
        words.add("bumblebee");
        words.add("hockey");
        words.add("peony");
        words.add("mustard");
        words.add("hyacinth");
        words.add("octopus");
    }
    public String getRandomWord(){
        int randomIndex=rand.nextInt(words.size());
        return words.get(randomIndex);
    }

}
