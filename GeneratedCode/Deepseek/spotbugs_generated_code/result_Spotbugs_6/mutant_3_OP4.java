import java.io.*;

class ObjectOutputStreamAppendBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() throws IOException {
        String fileName = "test.ser";
        ObjectOutputStream outputStream = null;

        if (new File(fileName).exists()) {
            OutputStream out = new FileOutputStream(fileName, true);
            outputStream = new ObjectOutputStream(out);
        } else {
            outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
        }

        // Unreachable if-else statement mutation
        if (getUnreachableCondition()) {
            System.out.println("This line should never execute.");
        } else {
            // Writing an object to the stream
            outputStream.writeObject("Test String");
            outputStream.close();
        }
    }

    public static void main(String[] args) {
        ObjectOutputStreamAppendBug bugDemo = new ObjectOutputStreamAppendBug();
        try {
            bugDemo.showBug();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}