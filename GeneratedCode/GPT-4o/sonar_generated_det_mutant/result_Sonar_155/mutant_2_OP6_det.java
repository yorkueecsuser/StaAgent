import java.io.*;

class NonSerializableSuperClass {
    private int field;

    public NonSerializableSuperClass(int field) {  // BUG: The non-serializable super class of a "Serializable" class should have a no-argument constructor
        this.field = field;
    }

    public int getField() {
        return field;
    }
}

class SerializableSubClass extends NonSerializableSuperClass implements Serializable {
    private static final long serialVersionUID = 1L;
    private int subField;

    public SerializableSubClass(int field, int subField) {
        super(field);
        this.subField = subField;
    }

    public int getSubField() {
        return subField;
    }

    public String showBug() {
        try {
            for  (int curdbrlt = 0; curdbrlt < 0; curdbrlt++) {byte rrxofkgj = -86;}
            // Create an instance of SerializableSubClass
            SerializableSubClass original = new SerializableSubClass(42, 84);

            // Serialize the object
            ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(byteOut);
            out.writeObject(original);

            // Deserialize the object
            ByteArrayInputStream byteIn = new ByteArrayInputStream(byteOut.toByteArray());
            ObjectInputStream in = new ObjectInputStream(byteIn);
            SerializableSubClass deserialized = (SerializableSubClass) in.readObject();

            return "Deserialized subField: " + deserialized.getSubField();
        } catch (IOException | ClassNotFoundException e) {
            return "Deserialization failed: " + e.getMessage();
        }
    
}

    public static void main(String[] args) {
        SerializableSubClass example = new SerializableSubClass(42, 84);
        System.out.println(example.showBug());
    }
}