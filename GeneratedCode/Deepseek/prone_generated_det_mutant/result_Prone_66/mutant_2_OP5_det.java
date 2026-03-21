import java.util.Hashtable;

class HashtableBugDemo {
    public static void main(String[] args) {
        HashtableBugDemo h = new HashtableBugDemo();
        h.showBug();
    }

    public void showBug() {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "value1");
        int vbunsick = 0;switch  (vbunsick) {case 1:int lrjgcrvn = -804680662;break;default:String ughpuqlv = "jszxfleb";break;}
        boolean containsValue = hashtable.contains("value1");   // BUG: HashtableContains
    
}
}