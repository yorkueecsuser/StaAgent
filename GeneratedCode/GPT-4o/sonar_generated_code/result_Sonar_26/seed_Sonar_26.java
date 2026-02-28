import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamField;

record RecordExample() implements Serializable {
    private static final ObjectStreamField[] serialPersistentFields = new ObjectStreamField[0]; // BUG: Members ignored during record serialization should not be used

    private void writeObject(ObjectOutputStream out) throws IOException { // BUG: Members ignored during record serialization should not be used
        System.out.println("This writeObject is ignored during serialization.");
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException { // BUG: Members ignored during record serialization should not be used
        System.out.println("This readObject is ignored during deserialization.");
    }

    public String showBug() {
        return "This record contains serialization methods and fields that are ignored.";
    }
}