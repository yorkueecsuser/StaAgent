import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;
    private String unusedVar; // Dead store mutation

    public BuggyClass(List<String> data) {
        this.data = data; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)
        unusedVar = "unusedVar"; // Initializing the dead store variable
    }

    public void showBug(String newData) {
        data.add(newData);
    }

    public List<String> getData() {
        return data;
    }
}