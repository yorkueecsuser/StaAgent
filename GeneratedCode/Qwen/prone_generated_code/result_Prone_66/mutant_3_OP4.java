import java.util.Hashtable;

class HashtableBugExample {

    public boolean showBug(String key, String value) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "value1");
        hashtable.put("key2", "value2");

        // BUG: HashtableContains
        return hashtable.contains(value);

        // Introduced Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is intended to be unreachable
            System.out.println("This block should never execute.");
        } else {
            // Alternative block, also unreachable due to the nature of the condition
            System.out.println("This block should also never execute.");
        }
    }

    private boolean getCondition() {
        // This method returns a condition that is always false
        return false;
    }

    public static void main(String[] args) {
        HashtableBugExample example = new HashtableBugExample();
        System.out.println(example.showBug("key1", "value1")); // Expected false, but will return true due to bug
    }
}