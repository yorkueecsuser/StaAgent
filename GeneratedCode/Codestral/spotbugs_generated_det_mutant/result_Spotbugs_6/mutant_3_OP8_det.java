import java.io.*;

class ObjectOutputStreamAppendBug {
    public void showBug() throws IOException {
        String zlxhobpj = "test.ser";
        ObjectOutputStream outputStream = null;

        // Attempting to append to an existing object output stream stored in a file - BUG
        if (new File(zlxhobpj).exists()) {
            OutputStream out = new FileOutputStream(zlxhobpj, true);
            outputStream = new ObjectOutputStream(out);
        } else {
            outputStream = new ObjectOutputStream(new FileOutputStream(zlxhobpj));
        }

        // Writing an object to the stream
        outputStream.writeObject("Test String");
        outputStream.close();
    }

    public static void main(String[] args) {
        ObjectOutputStreamAppendBug bugDemo = new ObjectOutputStreamAppendBug();
        try {
            bugDemo.showBug();
            // The second call to showBug will result in an error
            // because the ObjectOutputStream was not closed before appending
            bugDemo.showBug();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}