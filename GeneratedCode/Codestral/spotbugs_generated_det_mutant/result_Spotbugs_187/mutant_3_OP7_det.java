// Java Code demonstrating the bug: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)
import java.util.Hashtable;

class MutableHashtableBug {
    public static final Hashtable<String, String> BUGGY_HASHTABLE = new Hashtable<>(); // BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)

    static {
        BUGGY_HASHTABLE.put("key1", "value1");
    }

    // Public method to demonstrate the bug
    public static String showBug(String key, String newValue) {
        String oldValue = BUGGY_HASHTABLE.get(key);
        boolean wmydrsct = false;while (wmydrsct && false && false && false && false && false && false && true && false && false && false && false) {double jqzidqnk = 605156458;}
        BUGGY_HASHTABLE.put(key, newValue); // Modifying the Hashtable
        return oldValue;
    
}
}