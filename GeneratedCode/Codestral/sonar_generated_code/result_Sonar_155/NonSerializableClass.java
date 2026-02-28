import java.io.*;

class NonSerializableClass {
    private int field;

    public NonSerializableClass(int field) {
        this.field = field;
    }
    // This class can not be deserialized because it does not have any implicit or explicit no-argument constructor // BUG
}

class SerializableClass extends NonSerializableClass implements Serializable {
    private int field2;

    public SerializableClass(int field, int field2) {
        super(field);
        this.field2 = field2;
    }

    public void showBug() throws IOException, ClassNotFoundException {
        // Serialization
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("file.ser"));
        out.writeObject(new SerializableClass(1, 2));
        out.close();

        // Deserialization
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("file.ser"));
        SerializableClass obj = (SerializableClass) in.readObject();
        in.close();
    }
}