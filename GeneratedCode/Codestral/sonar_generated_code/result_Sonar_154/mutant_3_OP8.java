import java.io.*;

class ExternalizableBug implements Externalizable {
    private int value;
    private int a; // Mutant: Renamed 'value' to 'a'

    public ExternalizableBug(int value){
        this.value = value;
        this.a = value; // Mutant: Added this line to maintain the value in the new variable
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(a); // Mutant: Changed 'value' to 'a'
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        a = in.readInt(); // Mutant: Changed 'value' to 'a'
        value = a; // Mutant: Added this line to maintain the value in the original variable
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

        return deserializedBug.a; // Mutant: Changed 'value' to 'a'
    }
}