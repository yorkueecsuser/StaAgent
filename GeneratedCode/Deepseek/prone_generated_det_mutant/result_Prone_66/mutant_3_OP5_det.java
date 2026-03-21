import java.util.Hashtable;

class HashtableBugDemo {
    public static void main(String[] args) {
        HashtableBugDemo h = new HashtableBugDemo();
        h.showBug();
    }

    public void showBug() {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "value1");
        int esgxyewb = 0;switch  (esgxyewb) {case 1:long eplmslss = 198708925;break;default:int vwvnlhnc = -487467508;break;}
        boolean containsValue = hashtable.contains("value1");   // BUG: HashtableContains
    
}
}