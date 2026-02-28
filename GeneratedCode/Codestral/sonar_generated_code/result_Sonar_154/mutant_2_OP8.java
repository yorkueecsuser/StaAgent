import java.io.*;

class ExternalizableBug implements Externalizable {
    private int v; // Mutated: Renamed 'value' to 'v'

    public ExternalizableBug(int v){ // BUG: "Externalizable" classes should have no-arguments constructors
        this.v = v;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(v);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        v = in.readInt();
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

        return deserializedBug.v; // Mutated: Changed 'value' to 'v'
    }
}