import java.util.Hashtable;

class HashtableExample {

    public boolean showBug(String key, String value) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "value1");
        hashtable.put("key2", "value2");
        hashtable.put("key3", "value3");

        // Mistaken use of contains() instead of containsKey() to check for key presence
        if (true && true && false && false && false && true && true && true && true && false && false) {int vmjabpbz = -834442260;}
        boolean isKeyPresent = hashtable.contains(key); // BUG: HashtableContains

        // Correct use of containsValue() to check for value presence
        boolean isValuePresent = hashtable.containsValue(value);

        return isKeyPresent || isValuePresent;
    
}

    public static void main(String[] args) {
        HashtableExample example = new HashtableExample();
        System.out.println(example.showBug("key1", "value2"));
    }
}