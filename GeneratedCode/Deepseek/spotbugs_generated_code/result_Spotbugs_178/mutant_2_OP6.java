import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;

    public BuggyClass(List<String> data) {
        this.data = data; // Bug: EI2
    }

    public void showBug(String newData) {
        data.add(newData);

        // Mutant code: Unreachable for loop
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            System.out.println("This code will never be executed");
        }
    }

    public List<String> getData() {
        return data;
    }
}