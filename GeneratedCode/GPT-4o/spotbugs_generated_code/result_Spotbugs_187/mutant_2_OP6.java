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

        // Unreachable for loop inserted as a mutant
        boolean shouldNotExecute = getFalseCondition();
        for (int i = 0; shouldNotExecute; i++) {
            System.out.println("This should never print.");
        }
    }
    
    // Method to simulate a false condition for the unreachable loop
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        MutableHashtableExample example = new MutableHashtableExample();
        example.showBug();
    }
}