import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;
    private boolean isFalse = false;

    public BuggyClass(List<String> data) {
        this.data = data; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)
        if (isFalse) { // Unreachable if statement
            this.data = new ArrayList<>(); // This line is unreachable and does not change the original bug
        }
    }

    public void showBug(String newData) {
        data.add(newData);
    }

    public List<String> getData() {
        return data;
    }
}