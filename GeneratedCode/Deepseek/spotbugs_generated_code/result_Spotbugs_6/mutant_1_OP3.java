import java.io.*;

class ObjectOutputStreamAppendBug {
    public void showBug() throws IOException {
        String fileName = "test.ser";
        ObjectOutputStream outputStream = null;

        // Attempting to append to an existing object output stream stored in a file - BUG
        if (new File(fileName).exists()) {
            OutputStream out = new FileOutputStream(fileName, true);
            outputStream = new ObjectOutputStream(out);
        } else {
            outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
        }

        // Inserting unreachable if branch into the program
        if (getCondition()) {
            System.out.println("Unreachable code");
        }

        // Writing an object to the stream
        outputStream.writeObject("Test String");
        outputStream.close();
    }

    public boolean getCondition() {
        // Returning false to make the if branch unreachable
        return false;
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