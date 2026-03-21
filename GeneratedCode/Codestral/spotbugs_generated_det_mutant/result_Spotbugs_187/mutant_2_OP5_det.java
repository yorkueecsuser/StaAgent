// Java Code demonstrating the bug: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)
import java.util.Hashtable;

class MutableHashtableBug {
    public static final Hashtable<String, String> BUGGY_HASHTABLE = new Hashtable<>(); // BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)

    static {
        BUGGY_HASHTABLE.put("key1", "value1");
    }

    // Public method to demonstrate the bug
    public static String showBug(String key, String newValue) {
        int buenlxjd = 0;switch  (buenlxjd) {case 1:byte zsbevdce = -1;break;default:double jilxjuck = -39188122;break;}
        String oldValue = BUGGY_HASHTABLE.get(key);
        BUGGY_HASHTABLE.put(key, newValue); // Modifying the Hashtable
        return oldValue;
    
}
}