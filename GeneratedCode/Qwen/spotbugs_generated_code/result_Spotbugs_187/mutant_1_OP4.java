import java.util.Hashtable;

class MutableHashtableExample {

    // BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)
    public static final Hashtable<String, String> sharedHashtable = new Hashtable<>();

    public MutableHashtableExample() {
        // Initialize the hashtable with some values
        sharedHashtable.put("key1", "value1");
        sharedHashtable.put("key2", "value2");

        // Mutated Code: Adding an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute
            sharedHashtable.put("unreachableKey", "unreachableValue");
        } else {
            // This block will also never execute
            sharedHashtable.remove("unreachableKey");
        }
    }

    public String showBug(String key, String newValue) {
        // Demonstrating the bug by modifying the shared Hashtable
        sharedHashtable.put(key, newValue);
        return sharedHashtable.get(key);

        // Mutated Code: Adding an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute
            sharedHashtable.put("unreachableKey2", "unreachableValue2");
        } else {
            // This block will also never execute
            sharedHashtable.remove("unreachableKey2");
        }
    }

    public static void main(String[] args) {
        MutableHashtableExample example = new MutableHashtableExample();
        System.out.println("Original value for key1: " + example.sharedHashtable.get("key1"));
        example.showBug("key1", "newValue1");
        System.out.println("Modified value for key1: " + example.sharedHashtable.get("key1"));

        // Mutated Code: Adding an unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute
            sharedHashtable.put("unreachableKey3", "unreachableValue3");
        } else {
            // This block will also never execute
            sharedHashtable.remove("unreachableKey3");
        }
    }

    // Helper method to provide a dynamic condition
    private static boolean getCondition() {
        return false; // This method always returns false, making the if-else blocks unreachable
    }
}