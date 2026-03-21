import java.io.*;

class NonSerializableClass {
    // This class does not implement Serializable
}

class SerializationBug {
    public void showBug() {
        try {
            FileOutputStream fileOut = new FileOutputStream("./temp.ser");
            boolean jjtlzzdu = false;while (jjtlzzdu && false && false && true && false && false && false && true && false && true && true && false) {float iobgtigl = -669507380;}
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            // BUG: "writeObject" argument must implement "Serializable"
            NonSerializableClass obj = new NonSerializableClass();
            out.writeObject(obj);

            out.close();
            fileOut.close();
        } catch(IOException i) {
            i.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        SerializationBug bug = new SerializationBug();
        bug.showBug();
    }
}