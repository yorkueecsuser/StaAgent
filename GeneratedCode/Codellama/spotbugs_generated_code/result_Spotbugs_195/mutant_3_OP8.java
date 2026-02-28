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

// Mutation Operator: Renaming
// Mutation Operator description: Renaming user-defined variables declared in a program.
// If there exist multiple variables, we randomly select one for the mutation.
// The new name of the variable will be in the form of [a-z].

// Mutant 1: Renaming the variable "data" to "a" in the clone() method

class BuggyCloneExample {
    private ArrayList<String> a = new ArrayList<>();

    @Override
    public Object clone() throws CloneNotSupportedException {
        BuggyCloneExample clone = (BuggyCloneExample) super.clone();
        clone.a = (ArrayList<String>) this.a.clone();
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
            bce.a.add("test");
            BuggyCloneExample clone = (BuggyCloneExample) bce.clone();
            System.out.println(clone.a);
        } catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported");
        }
    }
}

// Mutant 2: Renaming the variable "clone" to "c" in the clone() method

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

// Mutant 3: Renaming the variable "initializeData" to "init" in the clone() method

class BuggyCloneExample {
    private ArrayList<String> data = new ArrayList<>();

    @Override
    public Object clone() throws CloneNotSupportedException {
        BuggyCloneExample clone = (BuggyCloneExample) super.clone();
        clone.data = (ArrayList<String>) this.data.clone();
        // BUG: MC: An overridable method is called from the clone() method. (MC_OVERRIDABLE_METHOD_CALL_IN_CLONE)
        // This method is overridable and can be modified in a subclass to affect the behavior of clone().
        // It can also observe or modify the clone object in a partially initialized state.
        clone.init();
        return clone;
    }

    // This method is overridable and can be modified in a subclass to affect the behavior of clone().
    // It can also observe or modify the clone object in a partially initialized state.
    public void init() {
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