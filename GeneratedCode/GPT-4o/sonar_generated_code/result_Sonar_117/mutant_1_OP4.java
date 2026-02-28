import java.util.ArrayList;
import java.util.List;

class BugDemo {

    private List<String> collection;

    public BugDemo(List<String> collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        // Inserting an unreachable if-else branch
        boolean condition = getDynamicCondition(); // ensure this condition is always false at runtime
        if (condition) {
            return "This branch is unreachable";
        } else {
            if (this.collection.isEmpty()) {
                return null; // BUG: "toString()" and "clone()" methods should not return null
            } else {
                return "Collection is not empty";
            }
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Inserting an unreachable if-else branch
        boolean condition = getDynamicCondition(); // ensure this condition is always false at runtime
        if (condition) {
            return new Object(); // This branch is unreachable
        } else {
            if (this.collection.isEmpty()) {
                return null; // BUG: "toString()" and "clone()" methods should not return null
            } else {
                return super.clone();
            }
        }
    }

    private boolean getDynamicCondition() {
        return false; // This simulates the condition being always false, but determined at runtime
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