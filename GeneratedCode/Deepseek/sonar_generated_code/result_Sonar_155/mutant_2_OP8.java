import java.io.*;

class NonSerializableClass {
    private int newField; // Renamed from field

    public NonSerializableClass(int newField) { // Renamed from field
        this.newField = newField;
    }
}

class SerializableClass extends NonSerializableClass implements Serializable {
    private static final long serialVersionUID = 1L;
    private int newField; // Renamed from field

    public SerializableClass(int newField) { // Renamed from field
        super(newField);
        this.newField = newField;
    }
}

class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        showBug();
    }

    public static void showBug() throws IOException, ClassNotFoundException {
        SerializableClass sc = new SerializableClass(10);

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(sc);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        try {
            SerializableClass sc2 = (SerializableClass) ois.readObject();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}