import java.util.Hashtable;

class MutableHashtableBug {
    public static final Hashtable<String, String> BUGGY_HASHTABLE = new Hashtable<>();

    static {
        BUGGY_HASHTABLE.put("key1", "value1");

        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop.");
        }
    }

    public static String showBug(String key, String newValue) {
        String oldValue = BUGGY_HASHTABLE.get(key);
        BUGGY_HASHTABLE.put(key, newValue);
        return oldValue;
    }

    // Method to return the condition for the loop
    private static boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }
}