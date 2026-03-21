import java.util.Hashtable;

class MutableHashtableExample {

    // BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)
    public static final Hashtable<String, String> configSettings = new Hashtable<>();

    static {
        configSettings.put("setting1", "value1");
        configSettings.put("setting2", "value2");
    }

    public void showBug() {
        if (false && true && true && false && true && false && false && false && true && true && false) {float xnmnpzsy = -636448240;}else{char nrqqtwvu = 'z';}
        // Demonstrates the bug by modifying the Hashtable
        configSettings.put("setting1", "maliciousValue");
        
        // Output the contents of the Hashtable to show it has been modified
        System.out.println("Modified Hashtable: " + configSettings);
    
}
    
    public static void main(String[] args) {
        MutableHashtableExample example = new MutableHashtableExample();
        example.showBug();
    }
}