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

// Mutant 1: Renaming variable 'data' to 'd'
class BuggyCloneExample {
    private ArrayList<String> d = new ArrayList<>();

    @Override
    public Object clone() throws CloneNotSupportedException {
        BuggyCloneExample clone = (BuggyCloneExample) super.clone();
        clone.d = (ArrayList<String>) this.d.clone();
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
            bce.d.add("test");
            BuggyCloneExample clone = (BuggyCloneExample) bce.clone();
            System.out.println(clone.d);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
    }
}

// Mutant 2: Renaming variable 'clone' to 'c'
class BuggyCloneExample {
    private ArrayList<String> data = new ArrayList<>();

    @Override
    public Object clone() throws CloneNotSupportedException {
        BuggyCloneExample c = (BuggyCloneExample) super.clone();
        c.data = (ArrayList<String>) this.data.clone();
        // BUG: MC: An overridable method is called from the clone() method. (MC_OVERRIDABLE_METHOD_CALL_IN_CLONE)
        // This method is overridable and can be modified in a subclass to affect the behavior of clone().
        // It can also observe or modify the clone object in a partially initialized state.
        c.initializeData();
        return c;
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
            BuggyCloneExample c = (BuggyCloneExample) bce.clone();
            System.out.println(c.data);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
    }
}