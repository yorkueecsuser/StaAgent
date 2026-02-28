import java.util.Hashtable;

class MutableHashtableBug {
    public static final Hashtable<String, String> BUGGY_HASHTABLE = new Hashtable<>();

    static {
        BUGGY_HASHTABLE.put("key1", "value1");
    }

    private static boolean getFalseCondition() {
        return false;
    }

    public static String showBug(String key, String newValue) {
        String oldValue = BUGGY_HASHTABLE.get(key);

        // Adding unreachable if statement
        if (getFalseCondition()) {
            return "Unreachable code";
        }

        BUGGY_HASHTABLE.put(key, newValue);
        return oldValue;
    }
}