import java.io.*;

class BuggyClass implements Serializable {
    private String data;
    private boolean unreachableCondition = false;

    public void initializeData(String data) {
        this.data = data;
        if(unreachableCondition) {
            // Unreachable code begins
            processData();
            // Unreachable code ends
        } else {
            processData(); // Original bug remains
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