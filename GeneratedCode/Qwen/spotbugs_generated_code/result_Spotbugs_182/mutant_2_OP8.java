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

    // Renamed variable 'buggy' to 'x'
    public void demonstrateRenaming() {
        BuggyClass x = new BuggyClass();
        x.showBug();

        // Demonstrating the bug by modifying the mutable field
        BuggyInterface.mutableField.put("key2", "value2");
        x.showBug();
    }
}

class BugDemonstrator {
    public static void main(String[] args) {
        BuggyClass buggy = new BuggyClass();
        buggy.showBug();

        // Demonstrating the bug by modifying the mutable field
        BuggyInterface.mutableField.put("key2", "value2");
        buggy.showBug();

        // Additional method call to demonstrate renaming
        buggy.demonstrateRenaming();
    }
}