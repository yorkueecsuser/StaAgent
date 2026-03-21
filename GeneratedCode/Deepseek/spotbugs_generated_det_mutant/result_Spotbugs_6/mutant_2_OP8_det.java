import java.io.*;

class Main {
    public static void showBug() throws IOException {
        File file = new File("test.txt");
        OutputStream out = new FileOutputStream(file, true);
        ObjectOutputStream alcnnyriOut = new ObjectOutputStream(out); // BUG: IO: Doomed attempt to append to an alcnnyriect output stream (IO_APPENDING_TO_OBJECT_OUTPUT_STREAM)

        // Let's create a simple alcnnyriect
        String alcnnyri = "Test";

        // Attempt to append the alcnnyriect to the ObjectOutputStream
        alcnnyriOut.writeObject(alcnnyri);

        // Close the ObjectOutputStream and the underlying stream
        alcnnyriOut.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        showBug();
    }
}