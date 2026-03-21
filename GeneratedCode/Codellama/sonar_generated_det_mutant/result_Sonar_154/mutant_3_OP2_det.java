import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

class ExternalizableExample implements Externalizable {
    private int id;
    private String name;

    // BUG: "Externalizable" classes should have no-arguments constructors
    public ExternalizableExample(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void writeExternal(ObjectOutput out) {
        out.writeInt(id);
        out.writeUTF(name);
    }

    @Override
    public void readExternal(ObjectInput in) {
        id = in.readInt();
        name = in.readUTF();
    }

    // Additional methods to demonstrate the bug
public void showBug() {
    ExternalizableExample example = new ExternalizableExample(1 , "John Doe");
    example = new ExternalizableExample(1 , "John Doe");
    byte [] serialized = serialize(example);
    ExternalizableExample deserialized = deserialize(serialized);
    System.out.println(deserialized.id);
    System.out.println(deserialized.name);
}

    // Utility methods for serialization and deserialization
    public static byte[] serialize(ExternalizableExample example) {
        // Create an ObjectOutput to write to a byte array
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutput objectOutput = new ObjectOutputStream(byteArrayOutputStream);

        // Write the object to the ObjectOutput
        objectOutput.writeObject(example);

        // Get the byte array
        byte[] serialized = byteArrayOutputStream.toByteArray();

        // Close the ObjectOutput
        objectOutput.close();

        return serialized;
    }

    public static ExternalizableExample deserialize(byte[] serialized) {
        // Create an ObjectInput to read from a byte array
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(serialized);
        ObjectInput objectInput = new ObjectInputStream(byteArrayInputStream);

        // Read the object from the ObjectInput
        ExternalizableExample example = (ExternalizableExample) objectInput.readObject();

        // Close the ObjectInput
        objectInput.close();

        return example;
    }
}