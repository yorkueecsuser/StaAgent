import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class SerializationBugExample {
    
    public static class NonSerializableClass {
        private int id;
        private String name;

        public NonSerializableClass(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public void showBug() {
        NonSerializableClass obj = new NonSerializableClass(1, "Test");

        try (FileOutputStream fileOut = new FileOutputStream("objectdata.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(obj); // BUG: "writeObject" argument must implement "Serializable"
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SerializationBugExample example = new SerializationBugExample();
        example.showBug();
    }
}