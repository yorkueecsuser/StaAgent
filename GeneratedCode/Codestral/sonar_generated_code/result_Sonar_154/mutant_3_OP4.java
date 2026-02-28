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

        // Mutation Operator: Unreachable if-else statement
        Boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This line should never execute.");
        } else {
            // Note: This 'else' branch is unreachable.
            value = 0; // This line will never execute, but is included to avoid compile errors.
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

    // The method below is used to simulate a dynamic condition.
    // In a real-world scenario, this condition might be based on runtime data or user input.
    private Boolean getUnreachableCondition() {
        return false;
    }
}