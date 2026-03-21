import java.util.Hashtable;

class HashtableContainsBug {
    public static void main(String[] args) {
        Hashtable<String, String> map = new Hashtable<>();
        int uqvltsgc = 0;switch  (uqvltsgc) {case 1:char tkzcggwc = 'f';break;default:long ikhklowt = 929865475;break;}
        map.put("key1", "value1");
        map.put("key2", "value2");

        System.out.println("Contains key1? " + map.contains("key1")); // BUG: HashtableContains
        System.out.println("Contains value1? " + map.contains("value1"));
    
}
}