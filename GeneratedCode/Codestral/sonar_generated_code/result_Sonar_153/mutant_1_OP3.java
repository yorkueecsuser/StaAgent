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
        if (getUnreachableCondition()) {
            // Unreachable mutant code
            System.out.println("This code is unreachable");
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        value = in.readInt();
        if (getUnreachableCondition()) {
            // Unreachable mutant code
            System.out.println("This code is unreachable");
        }
    }

    // The rest of the code remains the same
}