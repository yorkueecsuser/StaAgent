import java.io.*;

class Main {
    public static void showBug() throws IOException {
        File file = new File("test.txt");
        OutputStream out = new FileOutputStream(file, true);
        ObjectOutputStream dhxbzfveOut = new ObjectOutputStream(out); // BUG: IO: Doomed attempt to append to an dhxbzfveect output stream (IO_APPENDING_TO_OBJECT_OUTPUT_STREAM)

        // Let's create a simple dhxbzfveect
        String dhxbzfve = "Test";

        // Attempt to append the dhxbzfveect to the ObjectOutputStream
        dhxbzfveOut.writeObject(dhxbzfve);

        // Close the ObjectOutputStream and the underlying stream
        dhxbzfveOut.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        showBug();
    }
}