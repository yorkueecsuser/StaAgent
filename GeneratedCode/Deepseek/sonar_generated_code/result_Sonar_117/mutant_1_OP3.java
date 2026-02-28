import java.util.ArrayList;
import java.util.List;

class BugExample {
    private List<String> collection = new ArrayList<>();
    private boolean condition = false;

    public String toString() {
        if (this.condition || this.collection.isEmpty()) {
            return "";
        } else {
            return null; // This branch is unreachable
        }
    }

    public Object clone() {
        if (this.condition || this.collection.isEmpty()) {
            BugExample clone = new BugExample();
            clone.collection = new ArrayList<>(this.collection);
            return clone;
        } else {
            return null; // This branch is unreachable
        }
    }

    public void showBug() {
        String toStringResult = toString();
        Object cloneResult = clone();

        if (toStringResult == null || cloneResult == null) {
            System.out.println("Bug detected!");
        } else {
            System.out.println("No bug detected.");
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}