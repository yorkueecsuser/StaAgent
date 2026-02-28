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
    }
    
    public static void main(String[] args) {
        MutableHashtableExample e = new MutableHashtableExample();
        e.showBug();
    }
}

// Mutated code with Renaming mutation operator applied
class MutatedHashtableExample {

    // BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)
    public static final Hashtable<String, String> a = new Hashtable<>();

    static {
        a.put("setting1", "value1");
        a.put("setting2", "value2");
    }

    public void b() {
        // Demonstrates the bug by modifying the Hashtable
        a.put("setting1", "maliciousValue");
        
        // Output the contents of the Hashtable to show it has been modified
        System.out.println("Modified Hashtable: " + a);
    }
    
    public static void main(String[] args) {
        MutatedHashtableExample c = new MutatedHashtableExample();
        c.b();
    }
}