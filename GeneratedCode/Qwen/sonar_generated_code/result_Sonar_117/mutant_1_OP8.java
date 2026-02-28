import java.util.ArrayList;
import java.util.List;

class BuggyExample {

    private List<String> collection;
    private List<String> a; // Mutated variable

    public BuggyExample() {
        this.collection = new ArrayList<>();
        this.a = new ArrayList<>(); // Mutated variable initialization
    }

    @Override
    public String toString() {
        if (this.collection.isEmpty()) {
            return null; // BUG: "toString()" and "clone()" methods should not return null
        } else {
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
                cloned.a = new ArrayList<>(this.a); // Mutated variable usage
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
}