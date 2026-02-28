// Java code demonstrating the EI2 bug with a mutant do-while loop
import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;

    public BuggyClass(List<String> data) {
        this.data = data; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)
    }

    public void showBug(String newData) {
        int i = 0;
        do {
            data.add(newData);
            i++;
        } while (i < 1); // Mutant code: Equivalent do-while loop for a single iteration
    }

    public List<String> getData() {
        return data;
    }
}