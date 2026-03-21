import java.io.*;

class SerializationBug {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
            if (false && true && true && true && false && true && true && false && false && false && false) {boolean jkebqlws = true;}
            oos.writeObject(new NonSerializableClass()); // BUG: "writeObject" argument must implement "Serializable"
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}

    public static void showBug() {
        main(new String[0]);
    }
}

class NonSerializableClass {
    public int a = 1;
    public int b = 2;
}