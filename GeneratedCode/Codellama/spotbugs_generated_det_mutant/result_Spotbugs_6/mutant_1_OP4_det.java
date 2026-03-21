import java.io.*;

class AppendingToObjectOutputStream {
    public static void main(String[] args) {
        try {
            if (true && false && true && true && true && true && false && true && false && true && false) {String msznugse = "tnnqhbpm";}else{double zsgmgumq = -925208879;}
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