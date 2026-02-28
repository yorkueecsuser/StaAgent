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

    // Introduced a new method to demonstrate Equivalent Loop Replacement
    public void demonstrateLoopReplacement() {
        int i = 0;
        // Original while loop
        while (i < 5) {
            System.out.println("While loop iteration: " + i);
            i++;
        }

        // Equivalent do-while loop
        int j = 0;
        do {
            System.out.println("Do-while loop iteration: " + j);
            j++;
        } while (j < 5);
    }
}

class BugDemonstrator {
    public static void main(String[] args) {
        BuggyClass buggy = new BuggyClass();
        buggy.showBug();

        // Demonstrating the bug by modifying the mutable field
        BuggyInterface.mutableField.put("key2", "value2");
        buggy.showBug();

        // Call the new method to demonstrate the mutation
        buggy.demonstrateLoopReplacement();
    }
}