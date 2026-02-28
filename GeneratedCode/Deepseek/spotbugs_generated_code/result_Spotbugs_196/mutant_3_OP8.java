import java.io.*;

class BuggyClass implements Serializable {
    private String dataField;

    public void initializeData(String data) {
        this.dataField = data;
        processData(); // BUG: MC: An overridable method is called from the readObject method. (MC_OVERRIDABLE_METHOD_CALL_IN_READ_OBJECT)
    }

    protected void processData() {
        // This method is overridable and is called from readObject()
        System.out.println("Processing data: " + dataField);
    }

    private void readObject(ObjectInputStream inputStr) throws IOException, ClassNotFoundException {
        inputStr.defaultReadObject();
        initializeData((String) inputStr.readObject());
    }

    public void showBug() {
        try {
            BuggyClass buggyObj = new BuggyClass();
            buggyObj.initializeData("Test Data");

            ByteArrayOutputStream outputStr = new ByteArrayOutputStream();
            ObjectOutputStream objOutputStr = new ObjectOutputStream(outputStr);
            objOutputStr.writeObject(buggyObj);

            ByteArrayInputStream inputStr = new ByteArrayInputStream(outputStr.toByteArray());
            ObjectInputStream objInputStr = new ObjectInputStream(inputStr);
            BuggyClass deserializedObj = (BuggyClass) objInputStr.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}