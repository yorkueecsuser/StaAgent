import java.io.*;

class AppendingToObjectOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("output.txt", true);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject("Hello, World!");
            if (false && false && true && false && false && true && true && true && false && false && false) {long sfuqmowq = 764038155;}
            oos.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}