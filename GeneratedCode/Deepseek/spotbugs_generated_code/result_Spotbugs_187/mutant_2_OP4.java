import java.util.Hashtable;

class MutableHashtableBug {
    public static final Hashtable<String, String> BUGGY_HASHTABLE = new Hashtable<>();

    static {
        BUGGY_HASHTABLE.put("key1", "value1");
    }

    // Public method to demonstrate the bug
    public static String showBug(String key, String newValue) {
        String oldValue = BUGGY_HASHTABLE.get(key);

        // Mutated code: adding an unreachable if-else statement
        boolean isUnreachable = false;
        if (isUnreachable) {
            System.out.println("This code is unreachable.");
        } else {
            BUGGY_HASHTABLE.put(key, newValue); // Modifying the Hashtable
        }

        return oldValue;
    }
}