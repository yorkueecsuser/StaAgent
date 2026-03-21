import java.util.Hashtable;

class MutableHashtableBug {
    public static final Hashtable<String, String> BUGGY_HASHTABLE = new Hashtable<>();

    static {
        BUGGY_HASHTABLE.put("key1", "value1");
    }

    public static String showBug(String k, String n) {
        String ov = BUGGY_HASHTABLE.get(k);
        BUGGY_HASHTABLE.put(k, n);
        return ov;
    }
}