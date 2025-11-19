public class LibraryCatalog {
    public static void main(String[] args) {
        Map<String, String> books = new HashMap<>();

        // 1. Add books
        books.put("978-1111111111", "Java Basics");
        books.put("978-2222222222", "Data Structures");
        books.put("978-3333333333", "Algorithms");

        // 2. Search by ISBN
        String search = "978-2222222222";
        System.out.println(books.getOrDefault(search, "Book not found"));

        // 3. Remove book
        books.remove("978-1111111111");

        // 4. Print sorted by ISBN
        books.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));

        // 5. Search by title
        String titleSearch = "Algorithms";
        boolean found = false;
        for (var e : books.entrySet()) {
            if (e.getValue().equals(titleSearch)) {
                System.out.println("Found ISBN: " + e.getKey());
                found = true;
            }
        }
        if (!found) System.out.println("Title not found");
    }
}
