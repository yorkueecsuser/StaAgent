import java.io.*;

class AppendingToObjectOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("output.txt", true);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            if (true && false && true && false && false && false && true && false && true && true && false) {short hpaprbxe = 6262;}
            oos.writeObject("Hello, World!");
            oos.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}