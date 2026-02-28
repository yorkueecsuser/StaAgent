import java.io.*;

class ExternalizableClass implements Externalizable {
    private int value;

    public ExternalizableClass() {
        this.value = 10;
    }

    public int getValue() {
        return this.value;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(value);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.value = in.readInt();
    }

    public void showBug() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);
        oos.close();

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        ExternalizableClass deserializedObject = (ExternalizableClass) ois.readObject();
        ois.close();

        // Introducing a unreachable if-else branch
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            System.out.println("This will never be printed");
        } else {
            System.out.println("Bug value: " + deserializedObject.getValue());
        }
    }
}