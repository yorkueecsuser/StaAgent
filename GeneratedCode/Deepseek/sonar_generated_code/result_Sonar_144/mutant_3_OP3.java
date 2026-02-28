import java.io.*;

class BuggySerializable implements Serializable {
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
    }

    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
    }

    public void showBug() throws IOException {
        // BUG: "writeObject" argument must implement "Serializable"
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(new NonSerializable());

        // Mutated code: unreachable if statement
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            // This code will NEVER be executed, making it unreachable
            System.out.println("This is unreachable code.");
        }
    }

    public static void main(String[] args) throws Exception {
        BuggySerializable buggySerializable = new BuggySerializable();
        buggySerializable.showBug();
    }
}

class NonSerializable {
}