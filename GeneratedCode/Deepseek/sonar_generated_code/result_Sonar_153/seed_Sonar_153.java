import java.io.Serializable;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class CustomSerializationBug implements Serializable {
    private void writeObject(ObjectOutputStream oos) throws IOException {
        // BUG: Custom serialization methods should have required signatures
        oos.defaultWriteObject();
    }

    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        // BUG: Custom serialization methods should have required signatures
        ois.defaultReadObject();
    }

    public void showBug() {
        // This method does not perform any specific action but serves as a demonstration of the bug
        // BUG: Custom serialization methods should have required signatures
    }
}