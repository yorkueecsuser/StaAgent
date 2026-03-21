import java.io.*;

class ObjectOutputStreamAppendBug {
public void showBug() throws IOException {
    String fileName = "test.ser";
    ObjectOutputStream outputStream = null;
    outputStream = null;
    if(new File(fileName ).exists()){ OutputStream out = new FileOutputStream(fileName , true); outputStream = new ObjectOutputStream(out); } else { outputStream = new ObjectOutputStream(new FileOutputStream(fileName)); }
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