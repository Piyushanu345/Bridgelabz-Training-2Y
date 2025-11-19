import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new HashMap<>();

        grades.put("Rahul", 85.5);
        grades.put("Anita", 92.0);
        grades.put("Mohit", 76.5);

        
        grades.put("Rahul", 90.0); 

       
        grades.remove("Mohit");

        grades.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));
    }
}
