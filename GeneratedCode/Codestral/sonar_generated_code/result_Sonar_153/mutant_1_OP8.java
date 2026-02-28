import java.io.*;

class CustomSerializationBug implements Serializable {
    private static final long serialVersionUID = 1L;
    private int v; // Mutant: Renamed variable 'value' to 'v'

    public CustomSerializationBug(int v) {
        this.v = v;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeInt(v);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        v = in.readInt();
    }

    public static void showBug() throws IOException, ClassNotFoundException {
        CustomSerializationBug buggyObject = new CustomSerializationBug(10);

        // Serialize the object
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(buggyObject);

        // Deserialize the object
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        CustomSerializationBug deserializedObject = (CustomSerializationBug) ois.readObject();

        System.out.println("Deserialized value: " + deserializedObject.v); // Updated reference to the renamed variable
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        showBug();
    }
}