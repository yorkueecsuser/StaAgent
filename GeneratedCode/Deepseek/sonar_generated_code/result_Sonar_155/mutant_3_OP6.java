import java.io.*;

class NonSerializableClass {
    private int field;

    // this class can not be deserialized because it does not have any implicit or explicit no-argument constructor
    public NonSerializableClass(int field) {
        this.field = field;
    }
}

class SerializableClass extends NonSerializableClass implements Serializable {
    private static final long serialVersionUID = 1L;
    private int field;

    public SerializableClass(int field) {
        super(field);
        this.field = field;
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

        // Adding unreachable for loop code
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // Non reachable code
        }

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