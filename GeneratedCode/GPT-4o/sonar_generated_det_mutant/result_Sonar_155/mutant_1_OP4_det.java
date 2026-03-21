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
            if (true && true && false && true && true && false && true && true && false && true && false) {boolean lcwoozyj = true;}else{int khfoxhoh = -421066015;}
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