import java.io.*;

public class EOFExceptionExample {
    public static void main(String[] args) {
        try {
            ByteArrayInputStream input = new ByteArrayInputStream(new byte[]{});
            ObjectInputStream objStream = new ObjectInputStream(input);
            objStream.readObject();
        } catch (EOFException e) {
            System.out.println("EOFException caught: " + e.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

