import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;
    private String deadStore; // Added dead store variable

    public BuggyClass(List<String> data) {
        this.data = data;
        this.deadStore = "unusedVariable"; // Initialize dead store variable
    }

    public void showBug(String newData) {
        data.add(newData);
    }

    public List<String> getData() {
        return data;
    }
}