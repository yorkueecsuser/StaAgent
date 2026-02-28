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

        // Unreachable switch statement
        int value = getValue();
        switch (value) {
            case 1:
                // Do nothing
                break;
            case 2:
                // Do something
                break;
            case 3:
                // Do something else
                break;
            default:
                // Do something differently
                break;
        }
    }

    // Helper method to get a value for the switch expression
    private static int getValue() {
        // Code to determine the value dynamically
        return 2;
    }
}