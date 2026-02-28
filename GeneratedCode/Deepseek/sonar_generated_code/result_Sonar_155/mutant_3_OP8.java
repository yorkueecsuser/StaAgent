import java.io.*;

class NonSerializableClass {
    private int field1; // Renamed variable

    // this class can not be deserialized because it does not have any implicit or explicit no-argument constructor
    public NonSerializableClass(int field1) { // Renamed parameter
        this.field1 = field1;
    }
}

class SerializableClass extends NonSerializableClass implements Serializable {
    private static final long serialVersionUID = 1L;
    private int field2; // Renamed variable

    public SerializableClass(int field2) { // Renamed parameter
        super(field2);
        this.field2 = field2;
    }

    // BUG: The non-serializable super class of a "Serializable" class should have a no-argument constructor
}

class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        showBug();
    }

    public static void showBug() throws IOException, ClassNotFoundException {
        // Create a SerializableClass object
        SerializableClass sc = new SerializableClass(10);

        // Serialize the object
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(sc);
        oos.close();

        // Deserialize the object
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        try {
            SerializableClass sc2 = (SerializableClass) ois.readObject();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}