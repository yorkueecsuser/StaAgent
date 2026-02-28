import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerializationBug implements Serializable {
    private static final long serialVersionUID = 1L;

    private String data;

    public SerializationBug(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    // BUG: Se: The readResolve method must not be declared as a static method. (SE_READ_RESOLVE_IS_STATIC)
    private static Object readResolve() { // This line contains the bug
        return new SerializationBug("Resolved Data");
    }

    // Mutation: Duplicate the assignment statement in the constructor
    public SerializationBug(String data) {
        this.data = data;
        this.data = data; // Duplicated assignment statement
    }

    public static void main(String[] args) {
        SerializationBug original = new SerializationBug("Original Data");
        System.out.println("Original Data: " + original.getData());

        try {
            // Serialize the object
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(original);
            oos.flush();
            oos.close();

            // Deserialize the object
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            SerializationBug deserialized = (SerializationBug) ois.readObject();
            ois.close();

            System.out.println("Deserialized Data: " + deserialized.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String showBug() {
        return serializeAndDeserialize("Show Bug Data");
    }

    private String serializeAndDeserialize(String data) {
        SerializationBug original = new SerializationBug(data);

        try {
            // Serialize the object
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(original);
            oos.flush();
            oos.close();

            // Deserialize the object
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            SerializationBug deserialized = (SerializationBug) ois.readObject();
            ois.close();

            return deserialized.getData();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}