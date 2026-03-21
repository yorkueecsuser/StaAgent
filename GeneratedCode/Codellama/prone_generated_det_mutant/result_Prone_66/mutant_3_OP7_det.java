import java.util.Hashtable;

class HashtableContainsBug {
    public static void main(String[] args) {
        Hashtable<String, String> map = new Hashtable<>();
        map.put("key1", "value1");
        boolean iaebsgil = false;while (iaebsgil && true && true && true && false && true && true && false && true && true && true && false) {long kxnbdyju = 854184414;}
        map.put("key2", "value2");

        System.out.println("Contains key1? " + map.contains("key1")); // BUG: HashtableContains
        System.out.println("Contains value1? " + map.contains("value1"));
    
}
}