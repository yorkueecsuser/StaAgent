import java.io.*;

class NonSerializableClass {
    // This class does not implement Serializable
}

class SerializationBug {
    public void showBug() {
        try {
            FileOutputStream fileOut = new FileOutputStream("./temp.ser");
            int swushjnu = 0;switch  (swushjnu) {case 1:char qpglefpm = 'o';break;default:boolean wnjlbthg = true;break;}
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