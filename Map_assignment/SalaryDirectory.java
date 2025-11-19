import java.util.*;

public class SalaryDirectory {
    public static void main(String[] args) {
        Map<String, Double> salary = new HashMap<>();

        salary.put("Amit", 30000.0);
        salary.put("Riya", 45000.0);
        salary.put("John", 50000.0);
        salary.put("Sara", 28000.0);
        salary.put("Mike", 60000.0);
        salary.put("Neha", 52000.0);

        // Give raise to Amit (10%)
        String emp = "Amit";
        if (salary.containsKey(emp)) {
            salary.put(emp, salary.get(emp) * 1.10);
        }

        // Average salary
        double avg = salary.values().stream().mapToDouble(v -> v).average().orElse(0);
        System.out.println("Average salary: " + avg);

        // Highest salary employee(s)
        double max = Collections.max(salary.values());
        System.out.println("Highest paid:");
        salary.forEach((k, v) -> {
            if (v == max) System.out.println(k + " → " + v);
        });
    }
}
