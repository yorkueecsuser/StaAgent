import java.io.*;

class ObjectOutputStreamAppendBug {
    // Add a method to return a false condition for the unreachable for loop
    private boolean getFalseCondition() {
        return false;
    }

    public void showBug() throws IOException {
        String fileName = "test.ser";
        ObjectOutputStream outputStream = null;

        // Attempting to append to an existing object output stream stored in a file - BUG
        if (new File(fileName).exists()) {
            OutputStream out = new FileOutputStream(fileName, true);
            outputStream = new ObjectOutputStream(out);

            // Inserting an unreachable for loop
            for (int i = 0; getFalseCondition(); i++) {
                // This code will never be executed
                System.out.println("This is an unreachable statement");
            }
        } else {
            outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
        }

        // Writing an object to the stream
        outputStream.writeObject("Test String");
        outputStream.close();
    }

    // Rest of the code remains the same
    //...
}