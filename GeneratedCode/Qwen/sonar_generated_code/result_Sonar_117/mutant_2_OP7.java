import java.util.ArrayList;
import java.util.List;

class BuggyExample {

    private List<String> collection;

    public BuggyExample() {
        this.collection = new ArrayList<>();
    }

    @Override
    public String toString() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
        }
        if (this.collection.isEmpty()) {
            return null; // BUG: "toString()" and "clone()" methods should not return null
        } else {
            return this.collection.toString();
        }
    }

    @Override
    public Object clone() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
        }
        if (this.collection.isEmpty()) {
            return null; // BUG: "toString()" and "clone()" methods should not return null
        } else {
            try {
                BuggyExample cloned = (BuggyExample) super.clone();
                cloned.collection = new ArrayList<>(this.collection);
                return cloned;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(); // Can never happen
            }
        }
    }

    public void showBug() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
        }
        System.out.println("Demonstrating toString() bug:");
        System.out.println(toString()); // This will print null if collection is empty

        System.out.println("Demonstrating clone() bug:");
        BuggyExample clonedObject = (BuggyExample) clone(); // This will return null if collection is empty
        System.out.println(clonedObject == null? "Cloned object is null" : "Cloned object is not null");
    }

    public static void main(String[] args) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable while loop
        }
        BuggyExample example = new BuggyExample();
        example.showBug();
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }
}