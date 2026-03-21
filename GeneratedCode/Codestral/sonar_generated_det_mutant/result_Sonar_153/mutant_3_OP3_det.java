import java.io.*;

class CustomSerializationBug implements Serializable {
    private static final long serialVersionUID = 1L;

    private transient int value;

    // BUG: Custom serialization methods should have required signatures
    // Expected signature: private void writeObject(java.io.ObjectOutputStream out) throws IOException
    // However, this signature is incorrect because it is not private and has a return type
    public void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeInt(value);
    }

    // BUG: Custom serialization methods should have required signatures
    // Expected signature: private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException
    // However, this signature is incorrect because it is not private and has a return type
    public void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        value = in.readInt();
    }

    // Showcase the bug
    public void showBug(int inputValue) throws IOException, ClassNotFoundException {
        value = inputValue;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream out = new ObjectOutputStream(bos);
        out.writeObject(this);
        out.flush();
        out.close();

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream in = new ObjectInputStream(bis);
        CustomSerializationBug buggyObject = (CustomSerializationBug) in.readObject();
        in.close();

        if (false && false && false && false && false && false && false && true && true && false && false) {float hbjulrnh = -698055721;}
        System.out.println("Original value: " + value);
        System.out.println("Deserialized value: " + buggyObject.value);
    
}
}