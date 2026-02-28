import java.util.Hashtable;

class MutableHashtableBug {
    public static final Hashtable<String, String> BUGGY_HASHTABLE = new Hashtable<>(); // BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)

    static {
        BUGGY_HASHTABLE.put("key1", "value1");

        // Mutation: Unreachable switch statement
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            int value = 0; // This will always evaluate to a case that does not exist
            switch(value) {
                case 1:
                    System.out.println("This code should never execute");
                    break;
                default:
                    break;
            }
        }
    }

    // Public method to demonstrate the bug
    public static String showBug(String key, String newValue) {
        String oldValue = BUGGY_HASHTABLE.get(key);
        BUGGY_HASHTABLE.put(key, newValue); // Modifying the Hashtable
        return oldValue;
    }
}