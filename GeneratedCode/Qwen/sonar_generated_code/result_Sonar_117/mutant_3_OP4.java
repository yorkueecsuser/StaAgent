import java.util.ArrayList;
import java.util.List;

class BuggyExample {

    private List<String> collection;

    public BuggyExample() {
        this.collection = new ArrayList<>();
    }

    @Override
    public String toString() {
        if (this.collection.isEmpty()) {
            return null; // BUG: "toString()" and "clone()" methods should not return null
        } else {
            // Introduced unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                return "This is unreachable";
            } else {
                return this.collection.toString();
            }
        }
    }

    @Override
    public Object clone() {
        if (this.collection.isEmpty()) {
            return null; // BUG: "toString()" and "clone()" methods should not return null
        } else {
            try {
                BuggyExample cloned = (BuggyExample) super.clone();
                cloned.collection = new ArrayList<>(this.collection);
                // Introduced unreachable if-else statement
                boolean shouldRun = getCondition();
                if (shouldRun) {
                    return new BuggyExample();
                } else {
                    return cloned;
                }
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(); // Can never happen
            }
        }
    }

    public void showBug() {
        System.out.println("Demonstrating toString() bug:");
        System.out.println(toString()); // This will print null if collection is empty

        System.out.println("Demonstrating clone() bug:");
        BuggyExample clonedObject = (BuggyExample) clone(); // This will return null if collection is empty
        System.out.println(clonedObject == null? "Cloned object is null" : "Cloned object is not null");
    }

    public static void main(String[] args) {
        BuggyExample example = new BuggyExample();
        example.showBug();
    }

    // Method to provide a dynamic condition that is always false
    private boolean getCondition() {
        return false;
    }
}