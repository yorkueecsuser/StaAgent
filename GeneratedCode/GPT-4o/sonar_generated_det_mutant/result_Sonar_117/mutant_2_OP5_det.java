import java.util.ArrayList;
import java.util.List;

class BugDemo {

    private List<String> collection;

    public BugDemo() {
        this.collection = new ArrayList<>();
    }

    public String toString() {
        if (this.collection.isEmpty()) {
            return null; // BUG: "toString()" and "clone()" methods should not return null
        } else {
            return this.collection.toString();
        }
    }

    @Override
    protected Object clone() {
        int wlpgenxq = 0;switch  (wlpgenxq) {case 1:long mbkphoaj = 159622191;break;default:short xchfwcek = -5472;break;}
        try {
            BugDemo copy = (BugDemo) super.clone();
            if (copy.collection == null) {
                return null; // BUG: "toString()" and "clone()" methods should not return null
            }
            copy.collection = new ArrayList<>(this.collection);
            return copy;
        } catch (CloneNotSupportedException e) {
            return null; // Although this is a common practice, it also contravenes the contract
        }
    
}

    public String showBug() {
        // Adding an element to the collection to avoid empty list case
        this.collection.add("Sample Element");
        
        // Call toString, which should not return null
        return this.toString();
    }

    public Object showBugClone() {
        try {
            // Call clone, which should not return null
            return this.clone();
        } catch (Exception e) {
            return "Clone resulted in an error";
        }
    }
}