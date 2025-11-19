import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful!";
        sentence = sentence.toLowerCase().replaceAll("[^a-z ]", "");

        Map<String, Integer> freq = new HashMap<>();

        for (String word : sentence.split(" ")) {
            if (word.isEmpty()) continue;
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        freq.forEach((k, v) -> System.out.println(k + " → " + v));
    }
}
