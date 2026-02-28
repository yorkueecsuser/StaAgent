import java.io.*;

class BuggyClass implements Serializable {
    private String data;
    private boolean getUnreachableCondition() {
        return false;
    }

    public void initializeData(String data) {
        this.data = data;
        processData(); // BUG: MC: An overridable method is called from the readObject method. (MC_OVERRIDABLE_METHOD_CALL_IN_READ_OBJECT)
        // Mutant code: Unreachable for loop
        for (int i = 0; getUnreachableCondition(); i++) {
            System.out.println("This loop is unreachable.");
        }
    }

    protected void processData() {
        // This method is overridable and is called from readObject()
        System.out.println("Processing data: " + data);
    }

    private void readObject(ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
        inputStream.defaultReadObject();
        initializeData((String) inputStream.readObject());
    }

    public void showBug() {
        try {
            BuggyClass buggyObject = new BuggyClass();
            buggyObject.initializeData("Test Data");

            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(buggyObject);

            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            BuggyClass deserializedObject = (BuggyClass) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}