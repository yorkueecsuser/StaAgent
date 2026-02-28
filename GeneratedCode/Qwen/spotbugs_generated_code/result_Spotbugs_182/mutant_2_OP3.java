import java.util.Hashtable;

interface BuggyInterface {
    final static Hashtable<String, String> mutableField = new Hashtable<>(); // BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT) 

    void showBug();
}

class BuggyClass implements BuggyInterface {
    static {
        mutableField.put("key1", "value1");
        // Inserting an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            System.out.println("This is unreachable code.");
        }
    }

    private static boolean getCondition() {
        return false;
    }

    @Override
    public void showBug() {
        System.out.println(mutableField);
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