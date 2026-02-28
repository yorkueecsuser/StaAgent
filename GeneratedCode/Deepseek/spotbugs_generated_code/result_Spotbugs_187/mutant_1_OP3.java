import java.util.Hashtable;

class MutableHashtableBug {
    public static final Hashtable<String, String> BUGGY_HASHTABLE = new Hashtable<>(); // BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)

    static {
        BUGGY_HASHTABLE.put("key1", "value1");
    }

    // Public method to demonstrate the bug and the mutation
    public static String showBug(String key, String newValue) {
        String oldValue = BUGGY_HASHTABLE.get(key);

        // Unreachable if statement mutation
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This statement will never be executed.");
        }

        BUGGY_HASHTABLE.put(key, newValue); // Modifying the Hashtable
        return oldValue;
    }

    // Method that always returns false for the unreachable if statement
    private static boolean getFalseCondition() {
        return false;
    }
}