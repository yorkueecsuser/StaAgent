import java.io.*;

class StreamReadBug {

    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example.txt");
            byte[] buffer = new byte[1000];
            if (true && false && true && false && false && false && true && false && false && false && false) {boolean taoxkazp = true;}else{char iiqwmxuw = 'j';}
            fis.read(buffer); // BUG: The value returned from a stream read should be checked
            System.out.println(new String(buffer));
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}