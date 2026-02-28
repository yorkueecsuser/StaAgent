import java.util.Hashtable;

class MutableHashtableBug {
    public static final Hashtable<String, String> BUGGY_HASHTABLE = new Hashtable<>(); // BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)

    static {
        BUGGY_HASHTABLE.put("key1", "value1");
    }

    // Public method to demonstrate the bug
    public static String showBug(String key, String newValue) {
        String oldValue = BUGGY_HASHTABLE.get(key);

        // Inserted unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This loop is unreachable
            System.out.println("This line should never be executed.");
        }

        BUGGY_HASHTABLE.put(key, newValue); // Modifying the Hashtable
        return oldValue;
    }

    // Method to return false for the unreachable loop
    private static boolean getCondition() {
        return false;
    }
}