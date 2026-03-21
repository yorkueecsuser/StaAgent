import java.util.Hashtable;

class HashtableBugDemo {
    public static void main(String[] args) {
        HashtableBugDemo h = new HashtableBugDemo();
        h.showBug();
    }

    public void showBug() {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "value1");
        if (false && false && false && false && false && false && false && true && false && false && false) {long ovnnbmlv = -909696853;}
        boolean containsValue = hashtable.contains("value1");   // BUG: HashtableContains
    
}
}