import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;

    public BuggyClass(List<String> extData) {
        this.data = extData; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)
    }

    public void showBug(String newElement) {
        data.add(newElement);
    }

    public List<String> getData() {
        return data;
    }

    // Mutated code: Renaming user-defined variables
    public void addData(String newData) {
        data.add(newData);
    }
}