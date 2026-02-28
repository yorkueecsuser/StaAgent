import java.io.*;

class ObjectOutputStreamBug {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("example.txt", true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject("Hello, World!");
        oos.close();
        FileInputStream fis = new FileInputStream("example.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        String message = (String) ois.readObject();
        System.out.println(message);
        ois.close();

        // Unreachable if statement
        if (false) {
            oos.close();
        }
    }
}