import java.io.*;

class SerializationBug implements Serializable {

    private String data;

    public SerializationBug(String data) {
        this.data = data;
    }

    // Mutant code
    public void writeObject(ObjectOutputStream outt) throws IOException {
        outt.defaultWriteObject();
        outt.writeObject(data.toUpperCase());
    }

    public void readObject(ObjectInputStream inn) throws IOException, ClassNotFoundException {
        inn.defaultReadObject();
        data = (String) inn.readObject();
    }

    public SerializationBug showBug() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream outt = new ByteArrayOutputStream();
        ObjectOutputStream oss = new ObjectOutputStream(outt);
        oss.writeObject(this);
        oss.close();

        ByteArrayInputStream inn = new ByteArrayInputStream(outt.toByteArray());
        ObjectInputStream iss = new ObjectInputStream(inn);
        SerializationBug buggyObject = (SerializationBug) iss.readObject();
        iss.close();

        System.out.println("Original data: " + data);
        System.out.println("Deserialized data: " + buggyObject.data);

        return buggyObject;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializationBug bug = new SerializationBug("hello world");
        bug.showBug();
    }
}