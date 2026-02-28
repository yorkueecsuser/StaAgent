import java.util.Hashtable;

// Interface without the mutable field
interface BuggyInterface {
    void showBug();
}

// Class containing the moved and package protected mutable field
class BuggyHelper {
    static Hashtable<String, String> mutableField = new Hashtable<>();
}

class BuggyClass implements BuggyInterface {
    static {
        BuggyHelper.mutableField.put("key1", "value1");
    }

    @Override
    public void showBug() {
        System.out.println(BuggyHelper.mutableField);
    }
}

class BugDemonstrator {
    public static void main(String[] args) {
        BuggyClass buggy = new BuggyClass();
        buggy.showBug();

        // Demonstrating the bug by modifying the mutable field
        BuggyHelper.mutableField.put("key2", "value2");
        buggy.showBug();
    }
}