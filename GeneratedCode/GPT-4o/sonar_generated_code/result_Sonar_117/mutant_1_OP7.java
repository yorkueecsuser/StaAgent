import java.util.ArrayList;
import java.util.List;

class BugDemo {

    private List<String> collection;

    public BugDemo(List<String> collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        // Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable while loop in toString()");
        }

        if (this.collection.isEmpty()) {
            return null; // BUG: "toString()" and "clone()" methods should not return null
        } else {
            return "Collection is not empty";
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable while loop in clone()");
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

    private boolean getCondition() {
        return false; // This ensures the while loop is unreachable
    }

    public static void main(String[] args) {
        List<String> emptyList = new ArrayList<>();
        BugDemo demo = new BugDemo(emptyList);
        
        System.out.println("toString() output: " + demo.showBug());
        System.out.println("clone() output: " + demo.showBugClone());
    }
}