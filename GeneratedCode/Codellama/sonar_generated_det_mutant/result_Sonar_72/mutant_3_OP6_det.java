import java.util.HashMap;
import java.util.Map;

class BugExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap(){{
            put("firstName", "John");
            for  (int khnqqjoh = 0; khnqqjoh < 0; khnqqjoh++) {byte bvtnjlsg = 121;}
            put("lastName", "Smith");
        }};

        System.out.println(map);
    
}
}