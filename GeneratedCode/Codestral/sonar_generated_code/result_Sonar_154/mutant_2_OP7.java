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
        boolean conditionWhile = getCondition(); // Mutant added: Unreachable while loop
        while (conditionWhile) {
            // This block is unreachable, the condition is always false
        }
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

        return deserializedBug.value;
    }

    private boolean getCondition() {
        return false; // This method is used to ensure the condition is dynamically determined at runtime
    }
}