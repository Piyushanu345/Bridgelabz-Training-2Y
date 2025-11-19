import java.util.*;

public class CourseRegistration {
    public static void main(String[] args) {
        Map<String, Integer> course = new HashMap<>();

        course.put("CS101", 48);
        course.put("CS102", 10);
        course.put("CS103", 3);
        course.put("CS104", 55);
        course.put("CS105", 1);

        // Add/drop students
        course.put("CS101", course.get("CS101") + 3);
        course.put("CS103", Math.max(0, course.get("CS103") - 2));

        System.out.println("Near full (>=50):");
        course.forEach((k, v) -> { if (v >= 50) System.out.println(k + " → " + v); });

        System.out.println("\nUnder-subscribed (<5):");
        course.forEach((k, v) -> { if (v < 5) System.out.println(k + " → " + v); });
    }
}
