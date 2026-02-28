import java.io.*;

class ExternalizableBug implements Externalizable {
    private int value;
    private int v; // mutated code: renamed variable 'value' to 'v'

    public ExternalizableBug(int value){ // BUG: "Externalizable" classes should have no-arguments constructors
        this.v = value; // mutated code: use 'v' instead of 'value'
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(v); // mutated code: use 'v' instead of 'value'
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        v = in.readInt(); // mutated code: use 'v' instead of 'value'
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

        return deserializedBug.v; // mutated code: use 'v' instead of 'value'
    }
}