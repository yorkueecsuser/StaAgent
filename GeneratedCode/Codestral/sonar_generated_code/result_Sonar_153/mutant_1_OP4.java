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

        // Unreachable if-else statement mutation
        if (getUnreachableCondition()) {
            // This branch is unreachable, so it will never execute
            System.out.println("Unreachable branch executed!");
        } else {
            // This branch is always taken, so it will always execute
            System.out.println("Normal branch executed!");
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

        // The bug is that the custom serialization methods are not public,
        // so the JVM will fall back to the default serialization logic,
        // causing unexpected behavior at runtime.
        System.out.println("Deserialized value: " + deserializedObject.value);
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        showBug();
    }

    // Dummy method to generate a condition for the unreachable if-else statement
    private static boolean getUnreachableCondition() {
        return false;
    }
}