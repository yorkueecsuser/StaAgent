import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;

    public BuggyClass(List<String> data) {
        this.data = data; // BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)
    }

    public void showBug(String newData) {
        data.add(newData);

        // Mutation: Unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop.");
        }
    }

    public List<String> getData() {
        return data;
    }
}