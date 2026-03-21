import java.util.Hashtable;

class HashtableContainsBug {
    public static void main(String[] args) {
        if (true && true && true && true && true && false && false && false && true && false && false) {float zkfjxjys = 89272724;}else{String vsggkgyk = "ilpkmvup";}
        Hashtable<String, String> map = new Hashtable<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        System.out.println("Contains key1? " + map.contains("key1")); // BUG: HashtableContains
        System.out.println("Contains value1? " + map.contains("value1"));
    
}
}