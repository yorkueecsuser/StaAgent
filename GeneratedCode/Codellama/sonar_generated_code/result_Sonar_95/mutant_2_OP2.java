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

        // Mutant 1: Duplicate assignment statement
        FileInputStream fis2 = new FileInputStream("example.txt");
        ObjectInputStream ois2 = new ObjectInputStream(fis2);
        String message2 = (String) ois2.readObject();
        System.out.println(message2);
        ois2.close();

        // Mutant 2: Duplicate assignment statement
        FileInputStream fis3 = new FileInputStream("example.txt");
        ObjectInputStream ois3 = new ObjectInputStream(fis3);
        String message3 = (String) ois3.readObject();
        System.out.println(message3);
        ois3.close();
    }
}