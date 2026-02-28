import java.util.ArrayList;
import java.util.List;

class BugDemo {

    private List<String> collection;

    public BugDemo(List<String> collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        boolean unreachableCondition = isAlwaysFalse(); // Mutation: Introduced unreachable if statement
        if (unreachableCondition) {
            return "Unreachable Code"; // This block is unreachable
        }
        
        if (this.collection.isEmpty()) {
            return null; // BUG: "toString()" and "clone()" methods should not return null
        } else {
            return "Collection is not empty";
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        boolean unreachableCondition = isAlwaysFalse(); // Mutation: Introduced unreachable if statement
        if (unreachableCondition) {
            return "Unreachable Clone"; // This block is unreachable
        }
        
        if (this.collection.isEmpty()) {
            return null; // BUG: "toString()" and "clone()" methods should not return null
        } else {
            return super.clone();
        }
    }

    private boolean isAlwaysFalse() {
        return false; // Method that always returns false
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

    public static void main(String[] args) {
        List<String> emptyList = new ArrayList<>();
        BugDemo demo = new BugDemo(emptyList);
        
        System.out.println("toString() output: " + demo.showBug());
        System.out.println("clone() output: " + demo.showBugClone());
    }
}