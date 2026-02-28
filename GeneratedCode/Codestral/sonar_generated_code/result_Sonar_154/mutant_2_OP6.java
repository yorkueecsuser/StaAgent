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

    public int showBug() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutput out = new ObjectOutputStream(bos);
        out.writeObject(this);
        out.flush();

        // Insert unreachable for loop
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // This loop is unreachable as the condition is always false
        }

        byte[] byteArray = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(byteArray);
        ObjectInput in = new ObjectInputStream(bis);
        ExternalizableBug deserializedBug = (ExternalizableBug) in.readObject();

        return deserializedBug.value;
    }
}