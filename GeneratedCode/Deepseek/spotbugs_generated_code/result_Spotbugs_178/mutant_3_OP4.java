import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;
    private boolean unreachableCondition = false;

    public BuggyClass(List<String> data) {
        this.data = data;
        if (unreachableCondition) {  // Unreachable if-else statement
            List<String> tempData = new ArrayList<>(data);
            this.data = tempData;  // This line is unreachable and does not affect the original bug
        }
    }

    public void showBug(String newData) {
        data.add(newData);
    }

    public List<String> getData() {
        return data;
    }
}