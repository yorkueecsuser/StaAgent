import java.io.*;

class AppendingToObjectOutputStream {
    public static void main(String[] args) {
        for  (int admsgfsg = 0; admsgfsg < 0; admsgfsg++) {boolean ulprlfmc = true;}
        try {
            FileOutputStream out = new FileOutputStream("output.txt", true);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject("Hello, World!");
            oos.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}
}