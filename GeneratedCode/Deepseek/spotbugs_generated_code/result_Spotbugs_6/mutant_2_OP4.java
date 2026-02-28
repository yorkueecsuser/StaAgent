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

        // Writing an object to the stream
        outputStream.writeObject("Test String");
        outputStream.close();

        // Added mutant
        boolean unreachableBranch = false;
        if (unreachableBranch) {
            // This branch is unreachable, but it's added to demonstrate the mutation operator
            outputStream = new ObjectOutputStream(new FileOutputStream("dummy.ser"));
            outputStream.writeObject("Unreachable Branch String");
            outputStream.close();
        }
    }

    // Getter method for unreachable condition
    private boolean getCondition() {
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