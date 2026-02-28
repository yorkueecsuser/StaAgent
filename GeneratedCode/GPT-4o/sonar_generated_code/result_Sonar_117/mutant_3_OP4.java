import java.util.ArrayList;
import java.util.List;

class BugDemo {

    private List<String> collection;

    public BugDemo(List<String> collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        boolean condition = getCondition(); // Non-final variable used
        if (condition && this.collection.isEmpty()) { // Unreachable if-else statement
            return "Unreachable toString path"; // This block is unreachable
        } else {
            if (this.collection.isEmpty()) {
                return null; // Original code: "toString()" and "clone()" methods should not return null
            } else {
                return "Collection is not empty";
            }
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        boolean condition = getCondition(); // Non-final variable used
        if (condition && this.collection.isEmpty()) { // Unreachable if-else statement
            return "Unreachable clone path"; // This block is unreachable
        } else {
            if (this.collection.isEmpty()) {
                return null; // Original code: "toString()" and "clone()" methods should not return null
            } else {
                return super.clone();
            }
        }
    }

    public String showBug() {
        return this.toString();
    }

    public Object showBugClone() {
        try {
            return this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    private boolean getCondition() {
        return false; // This function always returns false, making the if-condition unreachable
    }

    public static void main(String[] args) {
        List<String> emptyList = new ArrayList<>();
        BugDemo demo = new BugDemo(emptyList);
        
        System.out.println("toString() output: " + demo.showBug());
        System.out.println("clone() output: " + demo.showBugClone());
    }
}