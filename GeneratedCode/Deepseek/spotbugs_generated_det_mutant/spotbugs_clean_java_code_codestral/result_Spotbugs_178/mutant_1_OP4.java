import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;

    public BuggyClass(List<String> data) {
        this.data = data;
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            throw new IllegalStateException("This branch should be unreachable.");
        } else {
            // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)
            this.data = new ArrayList<>(data); // Added a mutant that creates a copy of the data
        }
    }

    public void showBug(String newData) {
        data.add(newData);
    }

    public List<String> getData() {
        return data;
    }
}