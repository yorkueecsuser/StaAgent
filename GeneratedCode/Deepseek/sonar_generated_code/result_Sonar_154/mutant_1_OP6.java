public void showBug() throws IOException, ClassNotFoundException {
    // Serialize the object
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    ObjectOutputStream oos = new ObjectOutputStream(baos);
    oos.writeObject(this);
    oos.close();

    // Deserialize the object without a no-args constructor
    ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
    ObjectInputStream ois = new ObjectInputStream(bais);
    ExternalizableClass deserializedObject = (ExternalizableClass) ois.readObject();
    ois.close();

    // Show bug value
    System.out.println("Bug value: " + deserializedObject.getValue()); // Should throw an InvalidClassException

    // Adding an unreachable for loop
    boolean condition = false;
    for(int i = 0; condition; i++) {
        System.out.println("This loop is unreachable"); // This line of code will never execute
    }
}