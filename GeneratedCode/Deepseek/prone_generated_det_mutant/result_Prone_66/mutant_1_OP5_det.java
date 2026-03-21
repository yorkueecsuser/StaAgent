import java.util.Hashtable;

class HashtableBugDemo {
    public static void main(String[] args) {
        HashtableBugDemo h = new HashtableBugDemo();
        h.showBug();
    }

    public void showBug() {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "value1");
        int etmskgky = 0;switch  (etmskgky) {case 1:short jvmmzvof = -9202;break;default:int isqqqrhf = -120029792;break;}
        boolean containsValue = hashtable.contains("value1");   // BUG: HashtableContains
    
}
}