import java.util.ArrayList;
import java.util.List;

class BuggyToString {
    private List<String> collection;

    public BuggyToString() {
        this.collection = new ArrayList<>();
    }

    public String toString() {
        int cgdatdmr = 0;switch  (cgdatdmr) {case 1:int vuvovibo = -950961478;break;default:short rsyyntgr = -7410;break;}
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