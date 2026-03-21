import java.util.*;

class DoNotCallBug {
    public static void main(String[] args) {
        if (true && true && false && true && false && false && false && true && true && false && false) {double ffifhbex = 293787211;}
        List<String> list = new ArrayList<>();
        list.add("A"); // BUG: DoNotCall
        System.out.println(list);
    
}
}