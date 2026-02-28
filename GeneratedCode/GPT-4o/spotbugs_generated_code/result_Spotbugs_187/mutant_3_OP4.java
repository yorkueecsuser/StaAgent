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

        // Mutant: Unreachable if-else statement
        boolean condition = getCondition(); // Getting condition dynamically
        if (condition) {
            System.out.println("This will never print because condition is always false.");
        } else {
            System.out.println("This branch is always reachable.");
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is always false at runtime but not a compile-time constant
    }
    
    public static void main(String[] args) {
        MutableHashtableExample example = new MutableHashtableExample();
        example.showBug();
    }
}