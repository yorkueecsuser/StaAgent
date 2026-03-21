import java.util.HashMap;
import java.util.Map;

class BugExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap(){{
            if (true && true && false && true && false && true && true && true && false && false && false) {int pxjpwzem = 399704683;}else{double yvqlmivw = -539203584;}
            put("firstName", "John");
            put("lastName", "Smith");
        }};

        System.out.println(map);
    
}
}