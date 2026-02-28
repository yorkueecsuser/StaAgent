import java.io.*;

class SerializationBug implements Serializable {

    private String serializedData; // Mutant: Renamed variable 'data' to'serializedData'

    public SerializationBug(String serializedData) {
        this.serializedData = serializedData;
    }

    public void writeObject(ObjectOutputStream out) throws IOException { // BUG: Se: Method must be private in order for serialization to work (SE_METHOD_MUST_BE_PRIVATE)
        out.defaultWriteObject();
        out.writeObject(serializedData.toUpperCase());
    }

    public void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        serializedData = (String) in.readObject();
    }

    public SerializationBug showBug() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream(out);
        os.writeObject(this);
        os.close();

        ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
        ObjectInputStream is = new ObjectInputStream(in);
        SerializationBug buggyObject = (SerializationBug) is.readObject();
        is.close();

        System.out.println("Original data: " + serializedData);
        System.out.println("Deserialized data: " + buggyObject.serializedData);

        return buggyObject;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializationBug bug = new SerializationBug("hello world");
        bug.showBug();
    }
}