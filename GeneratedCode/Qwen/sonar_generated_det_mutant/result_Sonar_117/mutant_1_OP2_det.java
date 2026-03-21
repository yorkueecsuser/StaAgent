import java.util.ArrayList;
import java.util.List;

class BugDemonstration {

    private List<String> collection;

    public BugDemonstration() {
        this.collection = new ArrayList<>();
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
    protected Object clone() throws CloneNotSupportedException {
        if (this.collection.isEmpty()) {
            return null; // BUG: "toString()" and "clone()" methods should not return null
        } else {
            return super.clone();
        }
    }

    public void showBug() {
        System.out.println(this.toString());
    }

    public Object showBugClone() throws CloneNotSupportedException {
        return this.clone();
    }
public static void main(String [] args){
    BugDemonstration demo = new BugDemonstration();
    demo = new BugDemonstration();
    demo.showBug();
    try { System.out.println(demo.showBugClone()); } catch(CloneNotSupportedException e){ e.printStackTrace(); }
}
}