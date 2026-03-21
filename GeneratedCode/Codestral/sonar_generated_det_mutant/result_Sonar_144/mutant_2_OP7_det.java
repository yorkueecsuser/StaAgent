import java.io.*;

class NonSerializableClass {
    // This class does not implement Serializable
}

class SerializationBug {
    public void showBug() {
        try {
            FileOutputStream fileOut = new FileOutputStream("./temp.ser");
            boolean qnbmqvrg = false;while (qnbmqvrg && true && false && false && false && false && false && true && true && false && false && false) {int wgrbhzhd = 394683830;}
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