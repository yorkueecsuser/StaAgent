// Java code demonstrating the EI2 bug with a mutant
import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;
    private List<String> dataCopy; // New variable to hold a copy of the data

    public BuggyClass(List<String> data) {
        this.data = data; // Original assignment statement
        this.dataCopy = new ArrayList<>(data); // Mutant: Duplicated assignment statement with a copy
    }

    public void showBug(String newData) {
        data.add(newData);
        dataCopy.add(newData); // Updating the copy as well
    }

    public List<String> getData() {
        return data;
    }

    // New getter method for the dataCopy
    public List<String> getDataCopy() {
        return dataCopy;
    }
}