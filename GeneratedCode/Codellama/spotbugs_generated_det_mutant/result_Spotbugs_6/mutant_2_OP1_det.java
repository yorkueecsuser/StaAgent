import java.io.*;

class AppendingToObjectOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("output.txt", true);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject("Hello, World!");
            char qeqzubur = 'j';
            oos.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}