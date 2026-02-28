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
            // Inserting unreachable switch statement
            boolean unreachableCondition = getUnreachableCondition();
            switch (unreachableCondition) {
                case true:
                    System.out.println("This is an unreachable switch case.");
                    break;
                default:
                    System.out.println("This is also unreachable.");
                    break;
            }
            return this.collection.toString();
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
                // Inserting unreachable switch statement
                boolean unreachableCondition = getUnreachableCondition();
                switch (unreachableCondition) {
                    case true:
                        System.out.println("This is an unreachable switch case.");
                        break;
                    default:
                        System.out.println("This is also unreachable.");
                        break;
                }
                return cloned;
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

    // Method to provide a dynamic condition for unreachable code
    private boolean getUnreachableCondition() {
        return false; // This method always returns false, ensuring the switch is unreachable
    }
}