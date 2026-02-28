import java.util.Hashtable;

class MutableHashtableBug {
    public static final Hashtable<String, String> BUGGY_HASHTABLE = new Hashtable<>(); // BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)

    static {
        BUGGY_HASHTABLE.put("key1", "value1");
    }

    // Public method to demonstrate the bug
    public static String showBug(String key, String newValue) {
        String oldValue = BUGGY_HASHTABLE.get(key);

        // Mutant code: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This block is unreachable
            String unreachableValue = BUGGY_HASHTABLE.get("unreachableKey");
            BUGGY_HASHTABLE.put("unreachableKey", "unreachableValue");
        } else {
            // Original bug-containing code
            BUGGY_HASHTABLE.put(key, newValue); // Modifying the Hashtable
        }

        return oldValue;
    }
}