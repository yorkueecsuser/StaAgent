import java.util.Hashtable;

class MutableHashtableBug {
    public static final Hashtable<String, String> BUGGY_HASHTABLE = new Hashtable<>(); // BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)

    static {
        BUGGY_HASHTABLE.put("key1", "value1");
    }

    // Public method to demonstrate the bug
    public static String showBug(String key, String newValue) {
        String oldValue = BUGGY_HASHTABLE.get(key);
        BUGGY_HASHTABLE.put(key, newValue); // Modifying the Hashtable
        return oldValue;
    }

    // Equivalent do-while loop replacement (not applicable in this context, but added for demonstration)
    public static void uselessLoop() {
        int i = 0;
        do {
            System.out.println("This loop does nothing useful, but it's here to demonstrate the mutation operator.");
            i++;
        } while (i < 1);
    }
}