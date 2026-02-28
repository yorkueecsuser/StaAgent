import java.util.Hashtable;

class HashtableBugExample {

    public boolean showBug(String key, String value) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "value1");
        hashtable.put("key2", "value2");

        // BUG: HashtableContains
        return hashtable.contains(value);

        // Mutant: Renaming variable 'hashtable' to 'a'
        Hashtable<String, String> a = new Hashtable<>();
        a.put("key1", "value1");
        a.put("key2", "value2");
        return a.contains(value);
    }

    public static void main(String[] args) {
        HashtableBugExample example = new HashtableBugExample();
        System.out.println(example.showBug("key1", "value1")); // Expected false, but will return true due to bug
    }
}