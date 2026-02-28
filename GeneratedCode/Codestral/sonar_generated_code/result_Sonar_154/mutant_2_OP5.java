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
        byte[] byteArray = bos.toByteArray();

        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                // This code is unreachable
                System.out.println("Unreachable code executed!");
                break;
            default:
                break;
        }

        ByteArrayInputStream bis = new ByteArrayInputStream(byteArray);
        ObjectInput in = new ObjectInputStream(bis);
        ExternalizableBug deserializedBug = (ExternalizableBug) in.readObject();

        return deserializedBug.value;
    }

    private int getUnreachableValue() {
        // This method always returns 0, making the switch statement unreachable
        return 0;
    }
}