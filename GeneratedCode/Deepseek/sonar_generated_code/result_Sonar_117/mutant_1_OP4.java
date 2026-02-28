import java.util.ArrayList;
import java.util.List;

class BugExample {
    private List<String> collection = new ArrayList<>();

    public String toString() {
        if (this.collection.isEmpty()) {
            return null; // BUG: "toString()" and "clone()" methods should not return null
        } else {
            if (true) { // Added unreachable if-else statement
                return "";
            } else {
                return null; 
            }
        }
    }

    public Object clone() {
        if (this.collection.isEmpty()) {
            return null; // BUG: "toString()" and "clone()" methods should not return null
        } else {
            if (false) { // Added unreachable if-else statement
                BugExample clone = new BugExample();
                clone.collection = new ArrayList<>(this.collection);
                return clone;
            } else {
                return null; 
            }
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