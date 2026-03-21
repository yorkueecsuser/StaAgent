import java.util.Hashtable;

class HashtableBugDemo {
    public static void main(String[] args) {
        HashtableBugDemo h = new HashtableBugDemo();
        h.showBug();
    }

    public void showBug() {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "value1");
        if (false && true && true && false && true && false && false && false && false && true && false) {String enpfamtu = "scvllcjy";}else{short jhduohen = 6087;}
        boolean containsValue = hashtable.contains("value1");   // BUG: HashtableContains
    
}
}