// Java code demonstrating the EI2 bug
import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;
    private List<String> duplicatedData; // Mutant: Duplicated reference

    public BuggyClass(List<String> data) {
        this.data = data;
        this.duplicatedData = this.data; // Mutant: Duplicated assignment statement
    }

    public void showBug(String newData) {
        data.add(newData);
    }

    public List<String> getData() {
        return data;
    }

    public List<String> getDuplicatedData() { // Mutant: Method to access duplicated data
        return duplicatedData;
    }
}