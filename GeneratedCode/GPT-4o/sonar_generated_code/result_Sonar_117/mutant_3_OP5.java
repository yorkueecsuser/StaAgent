import java.util.ArrayList;
import java.util.List;

class BugDemo {

    private List<String> collection;

    public BugDemo(List<String> collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        if (this.collection.isEmpty()) {
            // Inserting unreachable switch statement
            int unreachableValue = getValue(); // Dynamic method call to avoid unreachable statement error
            switch (unreachableValue) {
                case 1:
                    return "Unreachable case 1";
                case 2:
                    return "Unreachable case 2";
                default:
                    // Default case should also be unreachable if conditions are met
                    return "Unreachable default";
            }
            // Original code
            return null; // BUG: "toString()" and "clone()" methods should not return null
        } else {
            return "Collection is not empty";
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        if (this.collection.isEmpty()) {
            // Inserting unreachable switch statement
            int unreachableValue = getValue(); // Dynamic method call to avoid unreachable statement error
            switch (unreachableValue) {
                case 3:
                    return new Object(); // Unreachable case 3
                case 4:
                    return new Object(); // Unreachable case 4
                default:
                    // Default case should also be unreachable if conditions are met
                    return new Object();
            }
            // Original code
            return null; // BUG: "toString()" and "clone()" methods should not return null
        } else {
            return super.clone();
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

    private int getValue() {
        // Returns 0 to ensure the switch statement is unreachable
        return 0;
    }

    public static void main(String[] args) {
        List<String> emptyList = new ArrayList<>();
        BugDemo demo = new BugDemo(emptyList);
        
        System.out.println("toString() output: " + demo.showBug());
        System.out.println("clone() output: " + demo.showBugClone());
    }
}