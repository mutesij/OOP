import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("nonexistent_file.txt");
            reader.close();
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}

