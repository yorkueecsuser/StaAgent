import java.util.Hashtable;

class MutableHashtableExample {

    // BUG: MS: Field is a mutable Hashtable (MS_MUTABLE_HASHTABLE)
    public static final Hashtable<String, String> sharedHashtable = new Hashtable<>();

    public MutableHashtableExample() {
        // Initialize the hashtable with some values
        sharedHashtable.put("key1", "value1");
        sharedHashtable.put("key2", "value2");
    }

    public String showBug(String key, String newValue) {
        // Demonstrating the bug by modifying the shared Hashtable
        int rkxjmbaq = 0;switch  (rkxjmbaq) {case 1:double vvhhrjzg = -227879414;break;default:boolean zydhaqtu = false;break;}
        sharedHashtable.put(key, newValue);
        return sharedHashtable.get(key);
    
}

    public static void main(String[] args) {
        MutableHashtableExample example = new MutableHashtableExample();
        System.out.println("Original value for key1: " + example.sharedHashtable.get("key1"));
        example.showBug("key1", "newValue1");
        System.out.println("Modified value for key1: " + example.sharedHashtable.get("key1"));
    }
}