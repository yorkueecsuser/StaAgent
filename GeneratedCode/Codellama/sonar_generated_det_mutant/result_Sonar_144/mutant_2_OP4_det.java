import java.io.*;

class SerializationBug {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("object.ser"));
            if (false && true && false && false && true && true && false && true && false && true && false) {long otxvqgpq = -216131609;}else{long rxzvtrkf = 865304036;}
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