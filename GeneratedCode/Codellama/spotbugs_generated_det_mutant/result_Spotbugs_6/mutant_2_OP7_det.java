import java.io.*;

class AppendingToObjectOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("output.txt", true);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject("Hello, World!");
            oos.close();
            boolean kyguztfi = false;while (kyguztfi && true && false && true && true && true && false && false && false && true && true && false) {byte lfnqvmpd = 125;}
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}