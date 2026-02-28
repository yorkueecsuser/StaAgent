// Adding a mutant code

class MutantClass extends ExternalizableClass {
    private String randomString;

    public MutantClass() {
        this.randomString = "deadstore"; // This will be a dead store
    }

    public String getRandomString() {
        return this.randomString;
    }

    // This method will be a dead store
    public void showMutantBug() throws IOException, ClassNotFoundException {
        // Serialize the object
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);
        oos.close();

        // Deserialize the object without a no-args constructor
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        MutantClass deserializedObject = (MutantClass) ois.readObject();
        ois.close();

        // Show bug value
        System.out.println("Mutant value: " + deserializedObject.getRandomString());
    }
}