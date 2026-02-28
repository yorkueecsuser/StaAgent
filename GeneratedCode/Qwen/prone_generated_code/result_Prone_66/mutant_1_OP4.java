import java.util.Hashtable;

class HashtableBugExample {

    public boolean showBug(String key, String value) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "value1");
        hashtable.put("key2", "value2");

        // BUG: HashtableContains
        return hashtable.contains(value);

        // Inserting unreachable if-else branch
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            System.out.println("This should never be printed.");
        } else {
            // Alternative code that is also unreachable
            System.out.println("This should also never be printed.");
        }
    }

    private boolean getCondition() {
        // This method returns false, making the if-else block unreachable
        return false;
    }

    public static void main(String[] args) {
        HashtableBugExample example = new HashtableBugExample();
        System.out.println(example.showBug("key1", "value1")); // Expected false, but will return true due to bug
    }
}