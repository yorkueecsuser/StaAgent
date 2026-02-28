import java.util.ArrayList;
import java.util.List;

class BugExample {
    private List<String> collection = new ArrayList<>();

    public String toString() {
        if (this.collection.isEmpty()) {
            return "";
        } else {
            return null; // MUTANT: This line is unreachable because the "return "";" line above will always execute before reaching here.
        }
    }

    public Object clone() {
        if (this.collection.isEmpty()) {
            return null; // MUTANT: This line is unreachable because the "return null;" line above will always execute before reaching here.
        } else {
            BugExample clone = new BugExample();
            clone.collection = new ArrayList<>(this.collection);
            return clone;
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