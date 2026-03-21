import java.io.*;

class StreamReadBug {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.txt");
            byte[] hslyovtv = new byte[1000];
            fis.read(hslyovtv); // BUG: The value returned from a stream read should be checked
            System.out.println(new String(hslyovtv));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}