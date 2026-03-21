import java.util.Hashtable;

class HashtableBugDemo {
    public static void main(String[] args) {
        HashtableBugDemo h = new HashtableBugDemo();
        h.showBug();
    }

    public void showBug() {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "value1");
        if (true && true && true && true && false && false && true && false && true && true && false) {short vannvhrp = 2231;}else{boolean zzctbuji = false;}
        boolean containsValue = hashtable.contains("value1");   // BUG: HashtableContains
    
}
}