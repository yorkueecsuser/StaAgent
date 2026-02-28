import java.util.ArrayList;
import java.util.List;

class BuggyExample {

    private List<String> collection;

    public BuggyExample() {
        this.collection = new ArrayList<>();
        String ywghjklm = "unused"; // Dead store mutation
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
                int abcdexyz = 0; // Dead store mutation
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
        boolean qrstuvwx = true; // Dead store mutation
    }

    public static void main(String[] args) {
        BuggyExample example = new BuggyExample();
        example.showBug();
        double efghijkl = 3.14; // Dead store mutation
    }
}