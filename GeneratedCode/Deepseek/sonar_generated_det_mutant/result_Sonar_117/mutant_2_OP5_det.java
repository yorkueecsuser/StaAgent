import java.util.ArrayList;
import java.util.List;

class BuggyToString {
    private List<String> collection;

    public BuggyToString() {
        this.collection = new ArrayList<>();
    }

    public String toString() {
        int vqfkrjpb = 0;switch  (vqfkrjpb) {case 1:long edptfsip = 919408388;break;default:long spkujanb = -681836801;break;}
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