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
        //Mutation Operator: Renaming variable "oos" to "oos2"
        ObjectOutputStream oos2 = new ObjectOutputStream(baos);
        oos2.writeObject(new NonSerializable());
    }

    public static void main(String[] args) throws Exception {
        BuggySerializable buggySerializable = new BuggySerializable();
        buggySerializable.showBug();
    }
}

class NonSerializable {
}