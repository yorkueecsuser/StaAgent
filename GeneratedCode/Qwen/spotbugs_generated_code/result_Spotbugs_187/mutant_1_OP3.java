import java.util.Hashtable;

class MutableHashtableExample {

    // BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)
    public static final Hashtable<String, String> sharedHashtable = new Hashtable<>();

    public MutableHashtableExample() {
        // Initialize the hashtable with some values
        sharedHashtable.put("key1", "value1");
        sharedHashtable.put("key2", "value2");

        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            sharedHashtable.put("unreachableKey", "unreachableValue");
        }
    }

    public String showBug(String key, String newValue) {
        // Demonstrating the bug by modifying the shared Hashtable
        sharedHashtable.put(key, newValue);
        return sharedHashtable.get(key);

        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            sharedHashtable.remove(key);
        }
    }

    public static void main(String[] args) {
        MutableHashtableExample example = new MutableHashtableExample();
        System.out.println("Original value for key1: " + example.sharedHashtable.get("key1"));
        example.showBug("key1", "newValue1");
        System.out.println("Modified value for key1: " + example.sharedHashtable.get("key1"));

        // Unreachable if statement mutation
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because getCondition() always returns false
            System.out.println("This is an unreachable print statement.");
        }
    }

    private static boolean getCondition() {
        // Always return false to ensure the if block is unreachable
        return false;
    }
}