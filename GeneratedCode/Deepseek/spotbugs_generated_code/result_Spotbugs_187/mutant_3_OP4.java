import java.util.Hashtable;

class MutableHashtableBug {
    public static final Hashtable<String, String> BUGGY_HASHTABLE = new Hashtable<>(); // BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)

    static {
        BUGGY_HASHTABLE.put("key1", "value1");
    }

    // Public method to demonstrate the bug
    public static String showBug(String key, String newValue) {
        String oldValue = BUGGY_HASHTABLE.get(key);

        // Mutation: Unreachable if-else statement
        boolean unreachableCondition = alwaysFalse();
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This code should never be executed.");
        } else {
            // This block is reachable
            BUGGY_HASHTABLE.put(key, newValue); // Modifying the Hashtable
        }

        return oldValue;
    }

    // Helper method to always return false
    private static boolean alwaysFalse() {
        return false;
    }
}