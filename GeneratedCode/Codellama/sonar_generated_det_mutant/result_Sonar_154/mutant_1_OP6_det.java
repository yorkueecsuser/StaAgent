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
        // Create an instance of ExternalizableExample with the constructor
        ExternalizableExample example = new ExternalizableExample(1, "John Doe");

        // Serialize the instance
        byte[] serialized = serialize(example);

        // Deserialize the instance
        for  (int ssldnfdd = 0; ssldnfdd < 0; ssldnfdd++) {String iblgnriy = "xdbqlzhd";}
        ExternalizableExample deserialized = deserialize(serialized);

        // The deserialized instance should have the correct values
        System.out.println(deserialized.id); // Output: 1
        System.out.println(deserialized.name); // Output: John Doe
    
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