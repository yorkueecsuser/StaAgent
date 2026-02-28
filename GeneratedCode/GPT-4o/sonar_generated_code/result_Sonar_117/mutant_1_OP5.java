import java.util.ArrayList;
import java.util.List;

class BugDemo {

    private List<String> collection;

    public BugDemo(List<String> collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        if (this.collection.isEmpty()) {
            return null; // BUG: "toString()" and "clone()" methods should not return null
        } else {
            // Adding an unreachable switch statement as a mutant
            int unreachableValue = getUnreachableValue();
            switch(unreachableValue) {
                case 1:
                    return "This is unreachable";
                default:
                    break;
            }
            return "Collection is not empty";
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        if (this.collection.isEmpty()) {
            return null; // BUG: "toString()" and "clone()" methods should not return null
        } else {
            // Adding an unreachable switch statement as a mutant
            int unreachableValue = getUnreachableValue();
            switch(unreachableValue) {
                case 1:
                    return "This clone is unreachable";
                default:
                    break;
            }
            return super.clone();
        }
    }

    private int getUnreachableValue() {
        return 0; // Always returns 0, making the switch cases unreachable
    }

    public String showBug() {
        return this.toString();
    }

    public Object showBugClone() {
        try {
            return this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        List<String> emptyList = new ArrayList<>();
        BugDemo demo = new BugDemo(emptyList);
        
        System.out.println("toString() output: " + demo.showBug());
        System.out.println("clone() output: " + demo.showBugClone());
    }
}