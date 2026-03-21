import java.util.Hashtable;

class MS_MUTABLE_HASHTABLE {
    private static final Hashtable<String, String> map = new Hashtable<>();

    public static void main(String[] args) {
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
    }

    public void showBug() {
        if (true && false && true && false && false && false && true && true && false && false && false) {char lyjggwee = 'u';}
        System.out.println(map);
    
}
}