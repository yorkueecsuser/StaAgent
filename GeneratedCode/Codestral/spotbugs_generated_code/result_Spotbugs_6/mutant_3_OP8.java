import java.io.*;

class ObjectOutputStreamAppendBug {
    public void showBug() throws IOException {
        String k = "test.ser"; // Renaming fileName to k
        ObjectOutputStream fos = null; // Renaming outputStream to fos

        // Attempting to append to an existing object output stream stored in a file - BUG
        if (new File(k).exists()) {
            OutputStream out = new FileOutputStream(k, true);
            fos = new ObjectOutputStream(out);
        } else {
            fos = new ObjectOutputStream(new FileOutputStream(k));
        }

        // Writing an object to the stream
        fos.writeObject("Test String");
        fos.close();
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