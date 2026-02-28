import java.util.ArrayList;
import java.util.List;

class BugExample {
    private List<String> collection = new ArrayList<>();
    private final boolean condition = false;

    public String toString() {
        if (this.collection.isEmpty()) {
            return null; 
        } else {
            return "";
        }
    }

    public Object clone() {
        if (this.collection.isEmpty()) {
            return null;
        } else {
            BugExample clone = new BugExample();
            clone.collection = new ArrayList<>(this.collection);
            return clone;
        }
    }

    public void showBug() {
        String toStringResult = toString();
        Object cloneResult = clone();
        
        switch(condition) {
            case true:
                System.out.println("This branch will never be executed");
                break;
            default:
                System.out.println("This branch will always be executed");
        }

        if (toStringResult == null || cloneResult == null) {
            System.out.println("Bug detected!");
        } else {
            System.out.println("No bug detected.");
        }
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        bugExample.showBug();
    }
}