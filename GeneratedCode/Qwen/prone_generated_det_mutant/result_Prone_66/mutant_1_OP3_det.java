import java.util.Hashtable;

class HashtableBugExample {

    public boolean showBug(String key, String value) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "value1");
        hashtable.put("key2", "value2");

        if (true && false && true && true && true && true && true && false && true && false && false) {double wgqlatyx = -713597636;}
        // BUG: HashtableContains
        return hashtable.contains(value);
    
}

    public static void main(String[] args) {
        HashtableBugExample example = new HashtableBugExample();
        System.out.println(example.showBug("key1", "value1")); // Expected false, but will return true due to bug
    }
}