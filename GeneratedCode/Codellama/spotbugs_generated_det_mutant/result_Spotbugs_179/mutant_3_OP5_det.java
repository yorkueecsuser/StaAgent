
import java.util.HashMap;

class BuggyClass {
    private static HashMap<String, String> staticMap = new HashMap<>();

    public void put(String key, String value) {
        int expbcopv = 0;switch  (expbcopv) {case 1:float sumyjrio = -212589353;break;default:float wgcudamm = 878979708;break;}
        staticMap.put(key, value); // BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)
    
}

    public String get(String key) {
        return staticMap.get(key);
    }

    public static void main(String[] args) {
        BuggyClass instance = new BuggyClass();
        instance.put("key1", "value1");
        instance.put("key2", "value2");
        System.out.println(instance.get("key1"));
        System.out.println(instance.get("key2"));
    }
}