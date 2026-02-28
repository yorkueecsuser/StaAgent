// Java code demonstrating the EI2 bug with an unreachable switch statement mutant
import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;

    public BuggyClass(List<String> data) {
        this.data = data; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)
    }

    public void showBug(String newData) {
        // Unreachable switch statement mutant
        boolean shouldNotRun = false;
        switch (shouldNotRun? 1 : 0) {
            case 1:
                // This section will never be executed
                System.out.println("This line should never print.");
                break;
        }

        data.add(newData);
    }

    public List<String> getData() {
        return data;
    }
}