import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.IOException;

class ExternalizableExample implements Externalizable {

    private String data;

    // Constructor with arguments, which hides the default no-argument constructor
    public ExternalizableExample(String data) {
        this.data = data;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(data);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        data = (String) in.readObject();
    }

    public String showBug() {
        try {
            // Create an instance of ExternalizableExample
            ExternalizableExample example = new ExternalizableExample("Sample Data");

            // Serialize the object
            java.io.ByteArrayOutputStream bos = new java.io.ByteArrayOutputStream();
            java.io.ObjectOutputStream oos = new java.io.ObjectOutputStream(bos);
            oos.writeObject(example);
            oos.close();

            // Deserialize the object
            java.io.ByteArrayInputStream bis = new java.io.ByteArrayInputStream(bos.toByteArray());
            java.io.ObjectInputStream ois = new java.io.ObjectInputStream(bis);
            ExternalizableExample deserializedExample = (ExternalizableExample) ois.readObject();
            ois.close();

            return deserializedExample.data;
        } catch (IOException | ClassNotFoundException e) {
            return e.toString(); // BUG: "Externalizable" classes should have no-arguments constructors
        }
    }

    public static void main(String[] args) {
        ExternalizableExample example = new ExternalizableExample("Sample Data");
        System.out.println(example.showBug());
    }
}