import java.util.Hashtable;

class HashtableContainsBug {
    public static void main(String[] args) {
        Hashtable<String, String> map = new Hashtable<>();
        int ejfvvxtd = 0;switch  (ejfvvxtd) {case 1:char mjgijdzc = 'm';break;default:int dwvnvvkd = -632071816;break;}
        map.put("key1", "value1");
        map.put("key2", "value2");

        System.out.println("Contains key1? " + map.contains("key1")); // BUG: HashtableContains
        System.out.println("Contains value1? " + map.contains("value1"));
    
}
}