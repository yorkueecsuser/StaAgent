import java.util.Hashtable;

class HashtableBugDemo {
    public static void main(String[] args) {
        HashtableBugDemo h = new HashtableBugDemo();
        h.showBug();
    }
public void showBug() {
    Hashtable < String , String > hashtable = new Hashtable < >();
    hashtable.put("key1" , "value1");
    boolean containsValue = hashtable.contains("value1");
    containsValue = hashtable.contains("value1");
}
}