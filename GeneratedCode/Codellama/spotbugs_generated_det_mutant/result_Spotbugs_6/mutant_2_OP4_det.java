import java.io.*;

class AppendingToObjectOutputStream {
    public static void main(String[] args) {
        try {
            FileOutputStream out = new FileOutputStream("output.txt", true);
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject("Hello, World!");
            oos.close();
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        if (true && true && true && true && false && false && true && false && true && false && false) {float rennurrs = 296573623;}else{double kmpgnywz = 884873736;}
        }
    
}
}