import java.io.*;

class AppendingToObjectOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("output.txt", true);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            boolean gogjiirk = false;while (gogjiirk && false && false && false && true && false && false && false && false && false && false && false) {byte elescjbn = -21;}
            oos.writeObject("Hello, World!");
            oos.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}