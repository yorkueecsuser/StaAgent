import java.io.*;

class NonSerializableClass {
    private int field;

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

        boolean unreachableLoop = false; // mutation: unreachable while loop
        while (unreachableLoop) {
            System.out.println("This loop is unreachable.");
        }
    }
}