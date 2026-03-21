import java.util.Hashtable;

class HashtableBugDemo {
    public static void main(String[] args) {
        HashtableBugDemo h = new HashtableBugDemo();
        h.showBug();
    }

    public void showBug() {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "value1");
        for  (int mqftjfqb = 0; mqftjfqb < 0; mqftjfqb++) {byte qrqixjhw = -97;}
        boolean containsValue = hashtable.contains("value1");   // BUG: HashtableContains
    
}
}