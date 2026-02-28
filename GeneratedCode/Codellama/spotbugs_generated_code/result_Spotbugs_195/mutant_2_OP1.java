import java.util.ArrayList;

class BuggyCloneExample {
    private ArrayList<String> data = new ArrayList<>();

    @Override
    public Object clone() throws CloneNotSupportedException {
        BuggyCloneExample clone = (BuggyCloneExample) super.clone();
        clone.data = (ArrayList<String>) this.data.clone();
        // BUG: MC: An overridable method is called from the clone() method. (MC_OVERRIDABLE_METHOD_CALL_IN_CLONE)
        // This method is overridable and can be modified in a subclass to affect the behavior of clone().
        // It can also observe or modify the clone object in a partially initialized state.
        clone.initializeData();
        return clone;
    }

    // This method is overridable and can be modified in a subclass to affect the behavior of clone().
    // It can also observe or modify the clone object in a partially initialized state.
    public void initializeData() {
        // Initialize the data in the clone object
    }

    public static void main(String[] args) {
        try {
            BuggyCloneExample bce = new BuggyCloneExample();
            bce.data.add("test");
            BuggyCloneExample clone = (BuggyCloneExample) bce.clone();
            System.out.println(clone.data);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
    }
}

// Dead Store mutation
class BuggyCloneExample {
    private ArrayList<String> data = new ArrayList<>();

    @Override
    public Object clone() throws CloneNotSupportedException {
        String deadStore = "RandomString"; // Dead store mutation
        BuggyCloneExample clone = (BuggyCloneExample) super.clone();
        clone.data = (ArrayList<String>) this.data.clone();
        // BUG: MC: An overridable method is called from the clone() method. (MC_OVERRIDABLE_METHOD_CALL_IN_CLONE)
        // This method is overridable and can be modified in a subclass to affect the behavior of clone().
        // It can also observe or modify the clone object in a partially initialized state.
        clone.initializeData();
        return clone;
    }

    // This method is overridable and can be modified in a subclass to affect the behavior of clone().
    // It can also observe or modify the clone object in a partially initialized state.
    public void initializeData() {
        // Initialize the data in the clone object
    }

    public static void main(String[] args) {
        try {
            BuggyCloneExample bce = new BuggyCloneExample();
            bce.data.add("test");
            BuggyCloneExample clone = (BuggyCloneExample) bce.clone();
            System.out.println(clone.data);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
    }
}