import java.io.*;

record BuggyRecord() implements Serializable {
    @Serial
    private static final ObjectStreamField[] serialPersistentFields = new ObjectStreamField[0]; // BUG: Members ignored during record serialization should not be used

    public void showBug() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(this);
        out.flush();
        out.close();

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream in = new ObjectInputStream(bis);
        BuggyRecord deserializedRecord = (BuggyRecord) in.readObject();
        in.close();
    }
}