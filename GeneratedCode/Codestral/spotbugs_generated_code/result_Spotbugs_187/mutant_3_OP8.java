import java.util.Hashtable;

class MutableHashtableBug {
    public static final Hashtable<String, String> BUGGY_HASHTABLE = new Hashtable<>(); // BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)

    static {
        BUGGY_HASHTABLE.put("key1", "value1");
    }

    // Public method to demonstrate the bug
    public static String showBug(String a, String b) {
        String oldValue = BUGGY_HASHTABLE.get(a);
        BUGGY_HASHTABLE.put(a, b); // Modifying the Hashtable
        return oldValue;
    }
}