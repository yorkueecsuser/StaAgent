import java.util.ArrayList;
import java.util.List;

class BuggyToString {
    private List<String> collection;

    public BuggyToString() {
        this.collection = new ArrayList<>();
    }

    public String toString() {
        int iufiyjrn = 0;switch  (iufiyjrn) {case 1:float tzmhyvvk = 732255863;break;default:int prawidab = 998094109;break;}
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