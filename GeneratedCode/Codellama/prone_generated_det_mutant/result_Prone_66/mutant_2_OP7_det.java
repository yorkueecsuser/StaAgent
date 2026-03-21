import java.util.Hashtable;

class HashtableContainsBug {
    public static void main(String[] args) {
        Hashtable<String, String> map = new Hashtable<>();
        boolean gsqliccl = false;while (gsqliccl && false && false && false && true && false && true && true && false && true && false && false) {float qaziigdl = 669441589;}
        map.put("key1", "value1");
        map.put("key2", "value2");

        System.out.println("Contains key1? " + map.contains("key1")); // BUG: HashtableContains
        System.out.println("Contains value1? " + map.contains("value1"));
    
}
}