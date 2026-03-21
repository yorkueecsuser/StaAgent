import java.util.Hashtable;

class MutableHashtableBug {
    public static final Hashtable<String, String> BUGGY_HASHTABLE = new Hashtable<>();

    static {
        BUGGY_HASHTABLE.put("key1", "value1");
    }

    public static String showBug(String key, String newValue) {
        String oldValue = BUGGY_HASHTABLE.get(key);
        // Unreachable while loop mutation
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This line is unreachable");
        }
        BUGGY_HASHTABLE.put(key, newValue);
        return oldValue;
    }
}