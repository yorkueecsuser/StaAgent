import java.io.*;

class Main {
    public static void showBug() throws IOException {
        File file = new File("test.txt");
        OutputStream out = new FileOutputStream(file, true);
        ObjectOutputStream yylotqwxOut = new ObjectOutputStream(out); // BUG: IO: Doomed attempt to append to an yylotqwxect output stream (IO_APPENDING_TO_OBJECT_OUTPUT_STREAM)

        // Let's create a simple yylotqwxect
        String yylotqwx = "Test";

        // Attempt to append the yylotqwxect to the ObjectOutputStream
        yylotqwxOut.writeObject(yylotqwx);

        // Close the ObjectOutputStream and the underlying stream
        yylotqwxOut.close();
        out.close();
    }

    public static void main(String[] args) throws IOException {
        showBug();
    }
}