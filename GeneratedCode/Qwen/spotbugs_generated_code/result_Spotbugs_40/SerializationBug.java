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

    public static void main(String[] args) {
        SerializationBug original = new SerializationBug("Original Data");
        System.out.println("Original Data: " + original.getData());

        try {
            // Serialize the object
            ByteArrayOutputStream xos = new ByteArrayOutputStream(); // Renamed 'bos' to 'xos'
            ObjectOutputStream yos = new ObjectOutputStream(xos); // Renamed 'oos' to 'yos'
            yos.writeObject(original);
            yos.flush();
            yos.close();

            // Deserialize the object
            ByteArrayInputStream xis = new ByteArrayInputStream(xos.toByteArray()); // Renamed 'bis' to 'xis'
            ObjectInputStream yis = new ObjectInputStream(xis); // Renamed 'ois' to 'yis'
            SerializationBug deserialized = (SerializationBug) yis.readObject();
            yis.close();

            System.out.println("Deserialized Data: " + deserialized.getData());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String showBug() {
        return serializeAndDeserialize("Show Bug Data");
    }

    private String serializeAndDeserialize(String data) {
        SerializationBug z = new SerializationBug(data); // Renamed 'original' to 'z'

        try {
            // Serialize the object
            ByteArrayOutputStream xos = new ByteArrayOutputStream(); // Renamed 'bos' to 'xos'
            ObjectOutputStream yos = new ObjectOutputStream(xos); // Renamed 'oos' to 'yos'
            yos.writeObject(z);
            yos.flush();
            yos.close();

            // Deserialize the object
            ByteArrayInputStream xis = new ByteArrayInputStream(xos.toByteArray()); // Renamed 'bis' to 'xis'
            ObjectInputStream yis = new ObjectInputStream(xis); // Renamed 'ois' to 'yis'
            SerializationBug deserialized = (SerializationBug) yis.readObject();
            yis.close();

            return deserialized.getData();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}