import java.util.Hashtable;

class MutableHashtableBug {
    public static final Hashtable<String, String> BUGGY_HASHTABLE = new Hashtable<>(); // BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)

    static {
        BUGGY_HASHTABLE.put("key1", "value1");
    }

    // Public method to demonstrate the bug
    public static String showBug(String key, String newValue) {
        String oldValue = BUGGY_HASHTABLE.get(key);
        BUGGY_HASHTABLE.put(key, newValue); // Modifying the Hashtable

        // Mutation: Unreachable switch statement
        boolean condition = false; // Always evaluates to false
        if (condition) {
            int value = 1;
            switch (value) {
                case 2: // Unreachable case
                    System.out.println("This line is unreachable");
                    break;
            }
        }

        return oldValue;
    }
}