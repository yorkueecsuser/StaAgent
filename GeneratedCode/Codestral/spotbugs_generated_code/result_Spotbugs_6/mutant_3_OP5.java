import java.io.*;

class ObjectOutputStreamAppendBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() throws IOException {
        String fileName = "test.ser";
        ObjectOutputStream outputStream = null;

        // Attempting to append to an existing object output stream stored in a file - BUG
        if (new File(fileName).exists()) {
            OutputStream out = new FileOutputStream(fileName, true);
            outputStream = new ObjectOutputStream(out);

            // Adding unreachable switch statement
            boolean unreachableCondition = getUnreachableCondition();
            switch (unreachableCondition? 1 : 0) {
                case 1:
                    System.out.println("Unreachable code block");
                    break;
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