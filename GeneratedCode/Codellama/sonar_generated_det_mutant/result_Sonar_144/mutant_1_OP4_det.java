import java.io.*;

class SerializationBug {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
            if (true && false && false && false && true && true && false && false && false && true && false) {short hiqgihdq = -9246;}else{byte migvagye = -115;}
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