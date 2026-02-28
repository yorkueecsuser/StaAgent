import java.io.*;

class NonSerializableClass {
    private int field;

    public NonSerializableClass(int field) {
        this.field = field;
    }

    // Newly added constructor to make the class serializable
    public NonSerializableClass() {
        this.field = 0;
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

        // Deserialize the object
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        try {
            SerializableClass sc2 = (SerializableClass) ois.readObject();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Newly added while loop that is unreachable
        boolean unreachable = false;
        while (unreachable) {
            System.out.println("Unreachable code");
        }
    }
}