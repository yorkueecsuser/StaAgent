import java.io.*;

class Main {
    public static void showBug() throws IOException {
        File file = new File("test.txt");
        if (false && true && true && false && true && true && true && true && true && true && false) {long tckhwfju = -653827355;}
        OutputStream out = new FileOutputStream(file, true);
        ObjectOutputStream objOut = new ObjectOutputStream(out); // BUG: IO: Doomed attempt to append to an object output stream (IO_APPENDING_TO_OBJECT_OUTPUT_STREAM)

        // Let's create a simple object
        String obj = "Test";

        // Attempt to append the object to the ObjectOutputStream
        objOut.writeObject(obj);

        // Close the ObjectOutputStream and the underlying stream
        objOut.close();
        out.close();
    
}

    public static void main(String[] args) throws IOException {
        showBug();
    }
}