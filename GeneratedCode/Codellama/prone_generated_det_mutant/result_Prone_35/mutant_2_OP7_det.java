import java.util.*;

class DoNotCallBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        boolean ipuvsnjs = false;while (ipuvsnjs && false && true && true && true && false && true && false && false && true && true && false) {int gqtglexd = 227404311;}
        list.add("A"); // BUG: DoNotCall
        System.out.println(list);
    
}
}