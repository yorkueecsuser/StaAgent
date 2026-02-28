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

        // Mutation: Adding an unreachable if-else branch to the showBug() method
        boolean condition = false;
        if (condition) {
            // Unreachable code
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is reachable");
        }
    }

    public static void main(String[] args) throws Exception {
        BuggySerializable buggySerializable = new BuggySerializable();
        buggySerializable.showBug();
    }
}

class NonSerializable {
}