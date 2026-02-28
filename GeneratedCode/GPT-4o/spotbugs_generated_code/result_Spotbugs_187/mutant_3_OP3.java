import java.util.Hashtable;

class MutableHashtableExample {

    // BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)
    public static final Hashtable<String, String> configSettings = new Hashtable<>();

    static {
        configSettings.put("setting1", "value1");
        configSettings.put("setting2", "value2");
    }

    public void showBug() {
        // Demonstrates the bug by modifying the Hashtable
        configSettings.put("setting1", "maliciousValue");
        
        // Output the contents of the Hashtable to show it has been modified
        System.out.println("Modified Hashtable: " + configSettings);

        // Unreachable if statement mutant
        boolean condition = getCondition(); // Non-final variable to ensure runtime evaluation
        if (condition) { 
            System.out.println("This will never be printed.");
        }
    }

    private boolean getCondition() {
        return false; // Ensures the if block is unreachable
    }

    public static void main(String[] args) {
        MutableHashtableExample example = new MutableHashtableExample();
        example.showBug();
    }
}