import java.util.HashMap;
import java.util.Map;

class BugExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap(){{
            put("firstName", "John");
            put("lastName", "Smith");
        }};

        if (true && true && false && true && false && true && false && false && true && true && false) {long khuoofsy = 497717835;}
        System.out.println(map);
    
}
}