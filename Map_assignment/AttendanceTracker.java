import java.util.*;

public class AttendanceTracker {
    public static void main(String[] args) {
        Map<String, Integer> attendance = new HashMap<>();
        List<String> students = List.of("Amit", "Riya", "John", "Sara", "Mike");

        // Initialize
        for (String s : students) attendance.put(s, 0);

        // 15 days attendance simulation
        Random r = new Random();
        for (int day = 1; day <= 15; day++) {
            List<String> presentToday = new ArrayList<>();
            for (String s : students) {
                if (r.nextBoolean()) presentToday.add(s);
            }
            for (String p : presentToday) {
                attendance.put(p, attendance.get(p) + 1);
            }
        }

        System.out.println("Under-attending (<10 days):");
        attendance.forEach((k, v) -> {
            if (v < 10) System.out.println(k + " → " + v);
        });
    }
}
