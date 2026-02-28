import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

class CustomSerializationExample implements Serializable {
    private static final long serialVersionUID = 1L;
    private String data;

    public CustomSerializationExample(String data) {
        this.data = data;
    }

    // Incorrect signature for writeObject
    private void writeObject(ObjectOutputStream out) throws IOException { // BUG: Custom serialization methods should have required signatures
        out.writeUTF(data + " - Custom Write");
    }

    // Incorrect signature for readObject
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException { // BUG: Custom serialization methods should have required signatures
        data = in.readUTF() + " - Custom Read";
    }

    public String getData() {
        return data;
    }

    public String showBug() {
        try {
            // Serialize the object
            ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(byteStream);
            out.writeObject(this);
            out.close();

            // Deserialize the object
            ByteArrayInputStream inputStream = new ByteArrayInputStream(byteStream.toByteArray());
            ObjectInputStream in = new ObjectInputStream(inputStream);

            CustomSerializationExample deserializedObject = (CustomSerializationExample) in.readObject();
            in.close();

            return deserializedObject.getData();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return "Error during serialization/deserialization";
        }
    }

    public static void main(String[] args) {
        CustomSerializationExample example = new CustomSerializationExample("Original Data");
        String result = example.showBug();
        System.out.println(result);
    }
}