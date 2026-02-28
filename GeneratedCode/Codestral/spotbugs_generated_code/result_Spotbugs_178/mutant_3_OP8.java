// Java code demonstrating the EI2 bug with a renamed variable
import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;

    public BuggyClass(List<String> initialData) {
        this.data = initialData; // The bug is still present here
    }

    public void showBug(String newDataElement) {
        data.add(newDataElement);
    }

    public List<String> getData() {
        return data;
    }
}