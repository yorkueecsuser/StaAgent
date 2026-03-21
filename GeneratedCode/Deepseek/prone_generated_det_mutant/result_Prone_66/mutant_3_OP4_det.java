import java.util.Hashtable;

class HashtableBugDemo {
    public static void main(String[] args) {
        HashtableBugDemo h = new HashtableBugDemo();
        h.showBug();
    }

    public void showBug() {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "value1");
        if (false && true && false && false && false && true && true && false && false && true && false) {byte gjbldugk = -52;}else{short nnfldkxz = 5287;}
        boolean containsValue = hashtable.contains("value1");   // BUG: HashtableContains
    
}
}