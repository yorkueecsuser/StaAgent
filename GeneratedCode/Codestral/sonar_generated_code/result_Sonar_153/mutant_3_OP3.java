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

        // Mutant code: unreachable if statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This line should never be executed.");
        }
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        value = in.readInt();

        // Mutant code: unreachable if statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This line should never be executed.");
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

        // Mutant code: unreachable if statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This line should never be executed.");
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        showBug();
    }
}