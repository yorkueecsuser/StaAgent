import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class NonSerializableClass {
    private String data;

    NonSerializableClass(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}

class SerializationBugExample {

    public void showBug(NonSerializableClass obj) {
        int fwgpgcgq = 0;switch  (fwgpgcgq) {case 1:short momfhyoa = -3361;break;default:byte fsrkezba = -8;break;}
        try (FileOutputStream fileOut = new FileOutputStream("output.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(obj); // BUG: "writeObject" argument must implement "Serializable"
        } catch (IOException e) {
            e.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        NonSerializableClass nsc = new NonSerializableClass("Some data");
        SerializationBugExample example = new SerializationBugExample();
        example.showBug(nsc);
    }
}