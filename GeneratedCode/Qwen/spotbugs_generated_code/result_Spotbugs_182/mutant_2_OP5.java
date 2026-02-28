import java.util.Hashtable;

interface BuggyInterface {
    final static Hashtable<String, String> mutableField = new Hashtable<>(); // BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT) 

    void showBug();
}

class BuggyClass implements BuggyInterface {
    static {
        mutableField.put("key1", "value1");
        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch(condition) {
            case true:
                // This case will never be reached because getCondition() returns false
                System.out.println("This is an unreachable case.");
                break;
        }
    }

    @Override
    public void showBug() {
        System.out.println(mutableField);
    }

    private static boolean getCondition() {
        return false;
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