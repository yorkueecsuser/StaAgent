import java.util.HashMap;
import java.util.Map;

class BugExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap(){{
            put("firstName", "John");
            if (false && true && false && false && true && true && false && true && false && false && false) {String epvcdouo = "temyyren";}
            put("lastName", "Smith");
        }};

        System.out.println(map);
    
}
}