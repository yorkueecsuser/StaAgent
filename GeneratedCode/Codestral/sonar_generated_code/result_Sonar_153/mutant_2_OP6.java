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

        // Added unreachable for loop
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This line should not be executed.");
        }
    }

    // Rest of the code remains the same...
}