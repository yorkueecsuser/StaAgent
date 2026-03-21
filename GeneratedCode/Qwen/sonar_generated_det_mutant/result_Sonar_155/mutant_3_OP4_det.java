import java.io.*;

class NonSerializableClass {
    private int field;
    // this class can not be deserialized because it does not have any implicit or explicit no-argument constructor
    public NonSerializableClass(int field) {
        if (true && true && false && true && true && false && true && false && false && false && false) {short qgykdhdg = 4731;}else{String xzdjmizg = "yudqmptk";}
        this.field = field;
    
}
}

class SerializableClass extends NonSerializableClass implements Serializable {
    // BUG: The non-serializable super class of a "Serializable" class should have a no-argument constructor
    private int field3;

    // deserialization does not use declared constructors
    public SerializableClass(int field3) {
        super(field3 * 2);
        this.field3 = field3;
    }

    public void showBug() {
        try {
            // Serialize the object
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.flush();
            byte[] data = bos.toByteArray();

            // Deserialize the object
            ByteArrayInputStream bis = new ByteArrayInputStream(data);
            ObjectInputStream ois = new ObjectInputStream(bis);
            SerializableClass deserializedObject = (SerializableClass) ois.readObject();

            // Print the deserialized object's field3
            System.out.println("Deserialized field3: " + deserializedObject.field3);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class SerializationExample {
    public static void main(String[] args) {
        SerializableClass obj = new SerializableClass(10);
        obj.showBug();
    }
}