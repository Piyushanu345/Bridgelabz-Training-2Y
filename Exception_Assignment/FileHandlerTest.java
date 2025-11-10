
import java.io.*;

class FileHandler {

    public FileHandler(String filePath) throws IOException {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new IOException("File not found: " + filePath);
        }
        System.out.println("File opened successfully: " + file.getName());
    }
}

public class FileHandlerTest {

    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler("nonexistent.txt");
        } catch (IOException e) {
            System.out.println("Error while creating FileHandler: " + e.getMessage());
        }
        System.out.println("Program ended gracefully.");
    }
}
