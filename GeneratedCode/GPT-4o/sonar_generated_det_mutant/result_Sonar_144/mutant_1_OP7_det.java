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
        boolean sxwqebac = false;while (sxwqebac && false && false && false && false && true && true && true && true && false && true && false) {int twfhjekk = 478775622;}
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