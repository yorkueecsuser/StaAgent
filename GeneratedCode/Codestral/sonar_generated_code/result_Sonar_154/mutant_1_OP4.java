import java.io.*;

class ExternalizableBug implements Externalizable {
    private int value;

    public ExternalizableBug(int value){
        this.value = value;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(value);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        value = in.readInt();
    }

    // New method to return always false
    private boolean isAlwaysFalse() {
        return false;
    }

    public int showBug() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutput out = new ObjectOutputStream(bos);
        out.writeObject(this);
        out.flush();
        byte[] byteArray = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(byteArray);
        ObjectInput in = new ObjectInputStream(bis);
        ExternalizableBug deserializedBug = (ExternalizableBug) in.readObject();

        // Insert unreachable if-else clause
        if (isAlwaysFalse()) {
            // This code will never execute
            System.out.println("This is an unreachable statement");
        } else {
            // This is the reachable part of the code
            return deserializedBug.value;
        }
    }
}