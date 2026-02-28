import java.util.Hashtable;

class MutableHashtableBug {
    public static final Hashtable<String, String> BUGGY_HASHTABLE = new Hashtable<>();

    static {
        BUGGY_HASHTABLE.put("key1", "value1");

        // Added unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This code is unreachable
            System.out.println("Unreachable code");
        }
    }

    public static String showBug(String key, String newValue) {
        String oldValue = BUGGY_HASHTABLE.get(key);
        BUGGY_HASHTABLE.put(key, newValue);
        return oldValue;
    }
}