import java.io.*;

class StreamReadBug {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.txt");
            byte[] mojeyyoa = new byte[1000];
            fis.read(mojeyyoa); // BUG: The value returned from a stream read should be checked
            System.out.println(new String(mojeyyoa));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}