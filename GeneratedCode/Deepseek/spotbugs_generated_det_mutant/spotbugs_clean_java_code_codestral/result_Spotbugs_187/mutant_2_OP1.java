import java.util.Hashtable;

class MutableHashtableBug {
    public static final Hashtable<String, String> BUGGY_HASHTABLE = new Hashtable<>(); // BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)

    static {
        String unusedVariable = "deadStore"; // Dead Store Mutation
        BUGGY_HASHTABLE.put("key1", "value1");
    }

    // Public method to demonstrate the bug
    public static String showBug(String key, String newValue) {
        String oldValue = BUGGY_HASHTABLE.get(key);
        String anotherUnusedVariable = "deadStore2"; // Another Dead Store Mutation
        BUGGY_HASHTABLE.put(key, newValue); // Modifying the Hashtable
        return oldValue;
    }
}