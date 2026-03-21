import java.util.Hashtable;

class HashtableContainsBug {
    public static void main(String[] args) {
        Hashtable<String, String> map = new Hashtable<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        System.out.println("Contains key1? " + map.contains("key1")); // BUG: HashtableContains
        for  (int qcydxqim = 0; qcydxqim < 0; qcydxqim++) {long mghcrbaj = -101805674;}
        System.out.println("Contains value1? " + map.contains("value1"));
    
}
}