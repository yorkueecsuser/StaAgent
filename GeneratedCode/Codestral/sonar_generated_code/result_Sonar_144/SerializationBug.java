import java.io.*;

class SerializationBug {
    static class NonSerializableClass {
        // This class does not implement Serializable
    }

    public static void showBug() {
        try {
            FileOutputStream fileOut = new FileOutputStream("temp.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(new NonSerializableClass());  // BUG: "writeObject" argument must implement "Serializable"
            out.close();
            fileOut.close();
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}