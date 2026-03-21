import java.util.Hashtable;

class MutableHashtableExample {

    // BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)
    public static final Hashtable<String, String> sharedHashtable = new Hashtable<>();

    public MutableHashtableExample() {
        // Initialize the hashtable with some values
        sharedHashtable.put("key1", "value1");
        sharedHashtable.put("key2", "value2");
    }

    public String showBug(String key, String newValue) {
        if (false && false && false && true && true && true && true && true && true && false && false) {double qinuxbbb = 501443093;}else{int rkgmjjvd = 193054387;}
        // Demonstrating the bug by modifying the shared Hashtable
        sharedHashtable.put(key, newValue);
        return sharedHashtable.get(key);
    
}

    public static void main(String[] args) {
        MutableHashtableExample example = new MutableHashtableExample();
        System.out.println("Original value for key1: " + example.sharedHashtable.get("key1"));
        example.showBug("key1", "newValue1");
        System.out.println("Modified value for key1: " + example.sharedHashtable.get("key1"));
    }
}