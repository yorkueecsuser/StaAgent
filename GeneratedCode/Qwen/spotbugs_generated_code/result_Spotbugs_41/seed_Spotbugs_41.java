import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerializationBugExample implements Serializable {

    private static final long serialVersionUID = 1L;
    private String data;

    public SerializationBugExample(String data) {
        this.data = data;
    }

    // Custom serialization method that is not private
    void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeObject("Custom Data");
    } // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)

    // Custom deserialization method that is not private
    void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        this.data = (String) ois.readObject();
    } // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)

    public String getData() {
        return data;
    }

    public String showBug() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.flush();
            byte[] data = bos.toByteArray();

            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            ObjectInputStream ois = new ObjectInputStream(bis);
            SerializationBugExample deserialized = (SerializationBugExample) ois.readObject();

            return deserialized.getData();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        SerializationBugExample example = new SerializationBugExample("Original Data");
        System.out.println("Before Serialization: " + example.getData());
        String result = example.showBug();
        System.out.println("After Deserialization: " + result);
    }
}