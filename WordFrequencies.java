import java.util.*;

public class WordFrequencies {
    public static void main(String[] args) {
        String text = "the quick brown fox jumps over the lazy dog the fox";
        String[] words = text.split(" ");
        TreeMap<String, Integer> frequencyMap = new TreeMap<>();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        System.out.println("Word Frequencies: " + frequencyMap);
    }
}

