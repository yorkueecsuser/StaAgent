import java.io.*;

class ObjectOutputStreamAppendBug {
    public void showBug() throws IOException {
        String fileName = "test.ser";
        ObjectOutputStream outputStream = null;

        // Attempting to append to an existing object output stream stored in a file - BUG
        if (new File(fileName).exists()) {
            OutputStream out = new FileOutputStream(fileName, true);
            outputStream = new ObjectOutputStream(out);

            // Inserted unreachable for loop
            boolean condition = false;
            for (int i = 0; condition; i++) {
                System.out.println("This line should not be executed.");
            }
        } else {
            outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
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