import java.util.Hashtable;

class MutableHashtableExample {

    // BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)
    public static final Hashtable<String, String> configSettings = new Hashtable<>();

    static {
        configSettings.put("setting1", "value1");
        configSettings.put("setting1", "value1"); // Duplicated assignment
        configSettings.put("setting2", "value2");
        configSettings.put("setting2", "value2"); // Duplicated assignment
    }

    public void showBug() {
        // Demonstrates the bug by modifying the Hashtable
        configSettings.put("setting1", "maliciousValue");
        configSettings.put("setting1", "maliciousValue"); // Duplicated assignment
        
        // Output the contents of the Hashtable to show it has been modified
        System.out.println("Modified Hashtable: " + configSettings);
        System.out.println("Modified Hashtable: " + configSettings); // Duplicated output
    }
    
    public static void main(String[] args) {
        MutableHashtableExample example = new MutableHashtableExample();
        example.showBug();
        example.showBug(); // Duplicated method call
    }
}