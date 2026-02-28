import java.util.ArrayList;
import java.util.List;

class BugDemo {

    private List<String> collection;

    public BugDemo(List<String> collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        boolean unreachableCondition = calculateUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable due to unreachableCondition always being false
            return "Unreachable block in toString()";
        }
        if (this.collection.isEmpty()) {
            return null; // BUG: "toString()" and "clone()" methods should not return null
        } else {
            return "Collection is not empty";
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        boolean unreachableCondition = calculateUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable due to unreachableCondition always being false
            return "Unreachable block in clone()";
        }
        if (this.collection.isEmpty()) {
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

    // Helper method to dynamically determine the unreachable condition
    private boolean calculateUnreachableCondition() {
        return false; // Always returns false to ensure the block is unreachable
    }

    public static void main(String[] args) {
        List<String> emptyList = new ArrayList<>();
        BugDemo demo = new BugDemo(emptyList);
        
        System.out.println("toString() output: " + demo.showBug());
        System.out.println("clone() output: " + demo.showBugClone());
    }
}