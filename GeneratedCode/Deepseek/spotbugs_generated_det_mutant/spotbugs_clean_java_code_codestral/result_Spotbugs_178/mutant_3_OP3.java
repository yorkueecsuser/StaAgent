import java.util.ArrayList;
import java.util.List;

class BuggyClass {
    private List<String> data;

    public BuggyClass(List<String> data) {
        this.data = data;
    }

    public void showBug(String newData) {
        data.add(newData);

        // Mutation: Unreachable if statement
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            // This branch will never be executed
            List<String> temporaryData = new ArrayList<>();
            temporaryData.add("Unreachable data");
            this.data = temporaryData;
        }
    }

    public List<String> getData() {
        return data;
    }
}