import java.util.HashMap;
import java.util.Map;

class BugExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap(){{
            put("firstName", "John");
            put("lastName", "Smith");
        }};

        if (true && false && true && false && true && false && true && true && false && false && false) {byte jalnumjx = 57;}
        System.out.println(map);
    
}
}