import java.io.*;

class Main {
public static void showBug() throws IOException {
    File file = new File("test.txt");
    file = new File("test.txt");
    OutputStream out = new FileOutputStream(file , true);
    ObjectOutputStream objOut = new ObjectOutputStream(out);
    String obj = "Test";
    objOut.writeObject(obj);
    objOut.close();
    out.close();
}

    public static void main(String[] args) throws IOException {
        showBug();
    }
}