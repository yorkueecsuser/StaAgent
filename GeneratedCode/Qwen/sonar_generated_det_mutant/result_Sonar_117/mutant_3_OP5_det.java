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
        int zhlaqepk = 0;switch  (zhlaqepk) {case 1:double nsdjhdny = -693357924;break;default:long mrralira = 487533739;break;}
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

    public static void main(String[] args) {
        BugDemonstration demo = new BugDemonstration();
        demo.showBug(); // This will print null
        try {
            System.out.println(demo.showBugClone()); // This will return null
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}