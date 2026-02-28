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
        // Added Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("Unreachable code block");
        }
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        value = in.readInt();
        // Added Unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("Unreachable code block");
        }
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

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        showBug();
    }
}