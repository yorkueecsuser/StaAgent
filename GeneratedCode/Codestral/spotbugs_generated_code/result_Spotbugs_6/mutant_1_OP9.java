import java.io.*;

class ObjectOutputStreamAppendBug {
    public void showBug() throws IOException {
        String fileName = "test.ser";
        ObjectOutputStream outputStream = null;

        // Replace the existing if-else block with a switch statement
        switch (new File(fileName).exists()? 1 : 0) {
            case 1:
                OutputStream out = new FileOutputStream(fileName, true);
                outputStream = new ObjectOutputStream(out);
                break;
            default:
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