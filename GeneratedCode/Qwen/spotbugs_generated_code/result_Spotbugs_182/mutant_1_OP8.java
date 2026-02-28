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

    // Mutated code with renaming operator applied to other identifiers
    private void displayInfo() {
        System.out.println("Displaying information...");
    }
}

class BugDemonstrator {
    public static void main(String[] args) {
        BuggyClass buggy = new BuggyClass();
        buggy.showBug();

        // Demonstrating the bug by modifying the mutable field
        BuggyInterface.mutableField.put("key2", "value2");
        buggy.showBug();

        // Additional mutated code with renaming operator applied
        String info = "Additional Info";
        System.out.println(info.toLowerCase());
    }
}