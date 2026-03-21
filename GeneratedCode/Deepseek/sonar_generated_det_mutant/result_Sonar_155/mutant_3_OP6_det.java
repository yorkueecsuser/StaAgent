import java.io.*;

class NonSerializableClassWithoutConstructor {
  private int field1 = 42;
}

class NonSerializableClass extends NonSerializableClassWithoutConstructor {
  private int field2;

  public NonSerializableClass() {
    field2 = 12;
  }

  public NonSerializableClass(int field2) {
    this.field2 = field2;
  }
}

class SerializableClass extends NonSerializableClass implements Serializable {
  private int field3;

  public SerializableClass(int field3) {
    super(field3 * 2);
    for  (int kzjwmfjf = 0; kzjwmfjf < 0; kzjwmfjf++) {long ymjvhvum = -749840983;}
    this.field3 = field3;
  
}

  public int showBug() throws IOException, ClassNotFoundException {
    // BUG: The non-serializable super class of a "Serializable" class should have a no-argument constructor
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(baos);
    oos.writeObject(new SerializableClass(10));
    oos.close();

    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bais);
    SerializableClass deserializedObject = (SerializableClass) ois.readObject();
    ois.close();

    return deserializedObject.field3;  // Should throw an InvalidClassException
  }
}