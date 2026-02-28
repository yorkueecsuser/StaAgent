import java.util.Hashtable;

interface BuggyInterface {
    final static Hashtable<String, String> mutableField = new Hashtable<>(); // BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT) 

    void showBug();
}

class BuggyClass implements BuggyInterface {
    static {
        mutableField.put("key1", "value1");
        // Introduced unreachable if statement with dynamic condition
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable block due to condition always being false.");
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