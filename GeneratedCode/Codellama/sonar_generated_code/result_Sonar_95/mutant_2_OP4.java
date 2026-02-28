import java.io.*;

class ObjectOutputStreamBug {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream("example.txt", true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject("Hello, World!");
        oos.close();

        // Inserted unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            // This code is unreachable
            System.out.println("This code is unreachable");
        } else {
            // This code is reachable
            System.out.println("This code is reachable");
        }

        FileInputStream fis = new FileInputStream("example.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        String message = (String) ois.readObject();
        System.out.println(message);
        ois.close();
    }

    // Dummy method to avoid compile-time constants
    private static boolean getCondition() {
        return Math.random() > 0.5;
    }
}