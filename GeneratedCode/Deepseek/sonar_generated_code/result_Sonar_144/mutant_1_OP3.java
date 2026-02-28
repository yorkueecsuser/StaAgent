import java.io.*;

class BuggySerializable implements Serializable {
    private void writeObject(ObjectOutputStream stream) throws IOException {
        stream.defaultWriteObject();
    }

    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
    }

    public void showBug() throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        
        // Mutation: Unreachable If Statement
        if (false) {
            oos.writeObject(new NonSerializable());
        }
    }

    public static void main(String[] args) throws Exception {
        BuggySerializable buggySerializable = new BuggySerializable();
        buggySerializable.showBug();
    }
}

class NonSerializable {
}