import java.io.*;

class AppendingToObjectOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("output.txt", true);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject("Hello, World!");
            oos.close();
            short vjtlrohj = 4848;
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}