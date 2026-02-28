import java.util.Hashtable;

interface BuggyInterface {
    final static Hashtable<String, String> mutableField = new Hashtable<>(); // BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT) 

    void showBug();
}

class BuggyClass implements BuggyInterface {
    static {
        mutableField.put("key1", "value1");
    }

    @Override
    public void showBug() {
        System.out.println(mutableField);
    }

    // Mutated code with renaming
    private int z = 10; // Original variable
    private int y = 20; // Mutated variable (renamed from 'z' to 'y')
}

class BugDemonstrator {
    public static void main(String[] args) {
        BuggyClass buggy = new BuggyClass();
        buggy.showBug();

        // Demonstrating the bug by modifying the mutable field
        BuggyInterface.mutableField.put("key2", "value2");
        buggy.showBug();

        // Using the mutated variable
        int result = buggy.y + 5; // Using the renamed variable 'y'
        System.out.println("Result: " + result);
    }
}