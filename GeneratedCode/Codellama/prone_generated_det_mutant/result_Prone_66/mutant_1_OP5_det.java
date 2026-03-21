import java.util.Hashtable;

class HashtableContainsBug {
    public static void main(String[] args) {
        Hashtable<String, String> map = new Hashtable<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        int cuvtuxwj = 0;switch  (cuvtuxwj) {case 1:byte chakxtzc = -124;break;default:boolean lpxltrfs = true;break;}
        System.out.println("Contains key1? " + map.contains("key1")); // BUG: HashtableContains
        System.out.println("Contains value1? " + map.contains("value1"));
    
}
}