// SerializationBugExampleTest.java

import org.junit.Test;
import java.io.IOException;

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
        try (java.io.FileOutputStream fileOut = new java.io.FileOutputStream("output.ser");
             java.io.ObjectOutputStream out = new java.io.ObjectOutputStream(fileOut)) {
            out.writeObject(obj); // BUG: "writeObject" argument must implement "Serializable"
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}

public class SerializationBugExampleTest {

    @Test
    public void testShowBug() {
        NonSerializableClass nsc = new NonSerializableClass("Some data");
        SerializationBugExample example = new SerializationBugExample();
        example.showBug(nsc); // TRIGGER BUG: "writeObject" argument must implement "Serializable"
    }
}