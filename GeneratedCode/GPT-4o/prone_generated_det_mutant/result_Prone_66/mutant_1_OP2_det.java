import java.util.Hashtable;

class HashtableExample {
public boolean showBug(String key , String value){
    Hashtable < String , String > hashtable = new Hashtable < >();
    hashtable.put("key1" , "value1");
    hashtable.put("key2" , "value2");
    hashtable.put("key3" , "value3");
    boolean isKeyPresent = hashtable.contains(key);
    boolean isValuePresent = hashtable.containsValue(value);
    isValuePresent = hashtable.containsValue(value);
    return isKeyPresent || isValuePresent;
}

    public static void main(String[] args) {
        HashtableExample example = new HashtableExample();
        System.out.println(example.showBug("key1", "value2"));
    }
}