//Q3:Write a Java Program to count the number of words in a string using HashMap.
import java.util.HashMap;

public class WordCounter {
    public static void main(String[] args) {
        String text = "Java program to count number of words.";

        HashMap<String, Integer> wordCountMap = new HashMap<>();
        String[] words = text.split("\\s+");

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (!word.isEmpty()) {
                if (wordCountMap.containsKey(word)) {
                    wordCountMap.put(word, wordCountMap.get(word) + 1);
                } else {
                    wordCountMap.put(word, 1);
                }
            }
        }
        System.out.println("Word Counts:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}

