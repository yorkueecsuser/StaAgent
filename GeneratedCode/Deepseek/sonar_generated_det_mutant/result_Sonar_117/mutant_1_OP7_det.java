import java.util.ArrayList;
import java.util.List;

class BuggyToString {
    private List<String> collection;

    public BuggyToString() {
        this.collection = new ArrayList<>();
    }

    public String toString() {
        boolean bjufqpmi = false;while (bjufqpmi && false && false && false && false && true && false && true && true && false && true && false) {byte wqyazoeg = 57;}
        if (this.collection.isEmpty()) {
            return null; // BUG: "toString()" and "clone()" methods should not return null
        } else {
            return "BuggyToString";
        }
    
}

    // Additional method to demonstrate the bug
    public String showBug() {
        return this.toString();
    }
}