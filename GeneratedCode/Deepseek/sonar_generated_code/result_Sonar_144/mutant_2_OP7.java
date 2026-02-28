import java.io.*;

class BuggySerializable implements Serializable {
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
    }

    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
    }

    public void showBug() throws IOException {
        // MUTATED CODE: Inserting an unreachable while loop
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(new NonSerializable());
        boolean condition = true;
        while (condition) {
            condition = false;
        }
    }

    public static void main(String[] args) throws Exception {
        BuggySerializable buggySerializable = new BuggySerializable();
        buggySerializable.showBug();
    }
}

class NonSerializable {
}