import java.io.*;

class CustomSerializationBug implements Serializable {
    private static final long serialVersionUID = 1L;
    private int value;

    public CustomSerializationBug(int value) {
        this.value = value;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeInt(value);

        // Inserted unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never execute
        }
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        value = in.readInt();
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

        System.out.println("Deserialized value: " + deserializedObject.value);
    }

    private static boolean getCondition() {
        return false; // This ensures the while loop is unreachable
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        showBug();
    }
}