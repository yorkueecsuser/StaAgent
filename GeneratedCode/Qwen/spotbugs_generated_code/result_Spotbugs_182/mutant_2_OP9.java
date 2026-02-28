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

        // Adding a new loop for demonstration purposes
        int i = 0;
        while (i < 5) {
            System.out.println("Original loop iteration: " + i);
            i++;
        }

        // Mutated loop using Equivalent Loop Replacement
        int j = 0;
        do {
            System.out.println("Mutated loop iteration: " + j);
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
    }
}