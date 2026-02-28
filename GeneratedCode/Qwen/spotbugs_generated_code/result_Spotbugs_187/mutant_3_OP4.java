import java.util.Hashtable;

class MutableHashtableExample {

    // BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)
    public static final Hashtable<String, String> sharedHashtable = new Hashtable<>();

    public MutableHashtableExample() {
        // Initialize the hashtable with some values
        sharedHashtable.put("key1", "value1");
        sharedHashtable.put("key2", "value2");

        // Inserting unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            sharedHashtable.put("unreachableKey", "unreachableValue");
        } else {
            // Alternative unreachable code
            sharedHashtable.remove("unreachableKey");
        }
    }

    public String showBug(String key, String newValue) {
        // Demonstrating the bug by modifying the shared Hashtable
        sharedHashtable.put(key, newValue);
        return sharedHashtable.get(key);

        // Inserting unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            sharedHashtable.put("anotherUnreachableKey", "anotherUnreachableValue");
        } else {
            // Alternative unreachable code
            sharedHashtable.remove("anotherUnreachableKey");
        }
    }

    public static void main(String[] args) {
        MutableHashtableExample example = new MutableHashtableExample();
        System.out.println("Original value for key1: " + example.sharedHashtable.get("key1"));
        example.showBug("key1", "newValue1");
        System.out.println("Modified value for key1: " + example.sharedHashtable.get("key1"));

        // Inserting unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            // Unreachable code
            sharedHashtable.put("mainUnreachableKey", "mainUnreachableValue");
        } else {
            // Alternative unreachable code
            sharedHashtable.remove("mainUnreachableKey");
        }
    }

    private static boolean getCondition() {
        // This method always returns false, making the branches unreachable
        return false;
    }
}