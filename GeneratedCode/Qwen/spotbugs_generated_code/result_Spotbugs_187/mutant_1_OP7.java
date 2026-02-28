import java.util.Hashtable;

class MutableHashtableExample {

    // BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)
    public static final Hashtable<String, String> sharedHashtable = new Hashtable<>();

    public MutableHashtableExample() {
        // Initialize the hashtable with some values
        sharedHashtable.put("key1", "value1");
        sharedHashtable.put("key2", "value2");

        // Introduced unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable loop.");
        }
    }

    public String showBug(String key, String newValue) {
        // Demonstrating the bug by modifying the shared Hashtable
        sharedHashtable.put(key, newValue);
        return sharedHashtable.get(key);

        // Introduced unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable loop in showBug.");
        }
    }

    private boolean getCondition() {
        // This method returns false, ensuring the loop is unreachable
        return false;
    }

    public static void main(String[] args) {
        MutableHashtableExample example = new MutableHashtableExample();
        System.out.println("Original value for key1: " + example.sharedHashtable.get("key1"));
        example.showBug("key1", "newValue1");
        System.out.println("Modified value for key1: " + example.sharedHashtable.get("key1"));

        // Introduced unreachable while loop
        boolean conditionWhile = getStaticCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable loop in main.");
        }
    }

    private static boolean getStaticCondition() {
        // This method returns false, ensuring the loop is unreachable
        return false;
    }
}