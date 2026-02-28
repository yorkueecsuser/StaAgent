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
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        value = in.readInt();

        // Unreachable switch statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int unreachableValue = 1;
            switch (unreachableValue) {
                case 2:
                    System.out.println("This line should never be reached.");
                    break;
            }
        }
    }

    private boolean getCondition() {
        return false;
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