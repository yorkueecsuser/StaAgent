import java.util.Hashtable;

class HashtableBugExample {

    public boolean showBug(String key, String value) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "value1");
        hashtable.put("key2", "value2");

        // BUG: HashtableContains
        return hashtable.contains(value);

        // Introduced Unreachable while loop as per mutation operator
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() returns false
            System.out.println("This loop should never execute.");
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        HashtableBugExample example = new HashtableBugExample();
        System.out.println(example.showBug("key1", "value1")); // Expected false, but will return true due to bug
    }
}