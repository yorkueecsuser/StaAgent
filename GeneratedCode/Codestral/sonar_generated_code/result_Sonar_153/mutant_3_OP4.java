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

        // Inserted unreachable if-else branch
        if (getUnreachableCondition()) {
            // Unreachable code
            int unreachableValue = 42;
        } else {
            // Alternative code (should never execute)
            throw new RuntimeException("This branch is unreachable");
        }
    }

    // Method to simulate unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }

    // Rest of the code...
}