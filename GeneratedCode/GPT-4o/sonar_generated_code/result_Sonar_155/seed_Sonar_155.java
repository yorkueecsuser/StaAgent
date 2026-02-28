import java.io.*;

// Non-serializable superclass
class NonSerializableClass {
    private int field;

    // This class does not have a no-argument constructor
    public NonSerializableClass(int field) {
        this.field = field;
    }
}

// Serializable subclass
class SerializableClass extends NonSerializableClass implements Serializable { // BUG: The non-serializable super class of a "Serializable" class should have a no-argument constructor

    // Constructor
    public SerializableClass(int field) {
        super(field);
    }

    // Method to demonstrate the bug
    public void showBug() {
        try {
            // Creating instance of SerializableClass
            SerializableClass obj = new SerializableClass(10);

            // Serializing the object
            FileOutputStream fileOut = new FileOutputStream("object.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(obj);
            out.close();
            fileOut.close();

            // Deserializing the object
            FileInputStream fileIn = new FileInputStream("object.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            SerializableClass deserializedObj = (SerializableClass) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Deserialization succeeded.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization failed: " + e);
        }
    }

    public static void main(String[] args) {
        SerializableClass instance = new SerializableClass(5);
        instance.showBug();
    }
}