import java.io.*;

class ExternalizableClass implements Externalizable {
    private int value;

    // Constructor with no-args

    public ExternalizableClass() {
        this.value = 10;
    }

    // Getter method
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

    // Mutated code for unreachable switch statement
    public void showBug() throws IOException, ClassNotFoundException {
        // Serialize the object
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);
        oos.close();

        // Deserialize the object without a no-args constructor
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        ExternalizableClass deserializedObject = (ExternalizableClass) ois.readObject();
        ois.close();

        // Show bug value
        System.out.println("Unreachable switch statement: " + deserializedObject.getValue());

        // Mutated code for unreachable switch statement
        int mutantValue = deserializedObject.getValue();
        switch (mutantValue) {
            case 0:
                System.out.println("Unreachable code");
                break;
            default:
                System.out.println("Neither default nor reachable");
                break;
        }
    }
}