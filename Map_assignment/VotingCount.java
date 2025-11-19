import java.util.*;

public class VotingCount {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();

        String[] simulatedVotes = {
            "Amit", "Riya", "Amit", "John", "Riya", "Amit",
            "John", "Amit", "Riya", "John"
        };

        for (String name : simulatedVotes) {
            votes.put(name, votes.getOrDefault(name, 0) + 1);
        }

        // Print vote count
        votes.forEach((k, v) -> System.out.println(k + " → " + v));

        // Find winner
        String winner = Collections.max(votes.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("\nWinner: " + winner);
    }
}
