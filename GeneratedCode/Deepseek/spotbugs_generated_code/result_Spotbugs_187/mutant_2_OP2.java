import java.util.Hashtable;

class MutableHashtableBug {
    public static final Hashtable<String, String> BUGGY_HASHTABLE = new Hashtable<>();

    static {
        BUGGY_HASHTABLE.put("key1", "value1");
        BUGGY_HASHTABLE.put("key1", "value1"); // Mutant: Duplicate assignment
    }

    public static String showBug(String key, String newValue) {
        String oldValue = BUGGY_HASHTABLE.get(key);
        BUGGY_HASHTABLE.put(key, newValue);
        BUGGY_HASHTABLE.put(key, newValue); // Mutant: Duplicate assignment
        return oldValue;
    }
}