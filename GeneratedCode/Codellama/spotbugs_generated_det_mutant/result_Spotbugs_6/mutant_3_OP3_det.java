import java.io.*;

class AppendingToObjectOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("output.txt", true);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject("Hello, World!");
            oos.close();
            out.close();
        if (false && false && true && false && true && true && false && false && false && true && false) {int rixiziae = 481422867;}
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}