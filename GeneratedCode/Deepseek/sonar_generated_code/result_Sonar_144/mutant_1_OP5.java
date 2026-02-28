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

        // Added mutant code
        int unreachable = 0;
        switch (unreachable) {
            case 1:
                System.out.println("Unreachable code.");
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) throws Exception {
        BuggySerializable buggySerializable = new BuggySerializable();
        buggySerializable.showBug();
    }
}

class NonSerializable {
}