import java.io.*;

class ObjectOutputStreamAppendBug {
    public void showBug() throws IOException {
        String file_name = "test.ser";
        ObjectOutputStream output_stream = null;

        // Attempting to append to an existing object output stream stored in a file - BUG
        if (new File(file_name).exists()) {
            OutputStream out = new FileOutputStream(file_name, true);
            output_stream = new ObjectOutputStream(out);
        } else {
            output_stream = new ObjectOutputStream(new FileOutputStream(file_name));
        }

        // Writing an object to the stream
        output_stream.writeObject("Test String");
        output_stream.close();
    }

    public static void main(String[] args) {
        ObjectOutputStreamAppendBug bug_demo = new ObjectOutputStreamAppendBug();
        try {
            bug_demo.showBug();
            // The second call to showBug will result in an error
            // because the ObjectOutputStream was not closed before appending
            bug_demo.showBug();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}