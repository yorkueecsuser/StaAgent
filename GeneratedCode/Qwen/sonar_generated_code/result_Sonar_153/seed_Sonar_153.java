import java.io.*;

class SerializationBug implements Serializable {
    private int number;

    public SerializationBug(int number) {
        this.number = number;
    }

    // Incorrect signature for custom serialization method
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        oos.writeInt(number * 2); // Intentionally writing a modified value
    } // BUG: Custom serialization methods should have required signatures

    // Incorrect signature for custom deserialization method
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        number = ois.readInt() / 2; // Intentionally reading and modifying the value
    } // BUG: Custom serialization methods should have required signatures

    public int getNumber() {
        return number;
    }

    public void showBug() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.flush();
            byte[] data = bos.toByteArray();

            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            ObjectInputStream ois = new ObjectInputStream(bis);
            SerializationBug deserialized = (SerializationBug) ois.readObject();

            System.out.println("Original number: " + this.number);
            System.out.println("Deserialized number: " + deserialized.getNumber());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SerializationBug bug = new SerializationBug(10);
        bug.showBug();
    }
}