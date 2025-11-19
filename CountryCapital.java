
import java.util.*;

public class CountryCapital {

    public static void main(String[] args) {
        Map<String, String> capital = new HashMap<>();

        capital.put("India", "New Delhi");
        capital.put("USA", "Washington DC");
        capital.put("Japan", "Tokyo");
        capital.put("France", "Paris");
        capital.put("Germany", "Berlin");
        capital.put("Italy", "Rome");
        capital.put("Canada", "Ottawa");
        capital.put("Brazil", "Brasília");

        String query = "Japan";
        System.out.println(capital.getOrDefault(query, "Unknown country"));

        capital.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));
    }
}
