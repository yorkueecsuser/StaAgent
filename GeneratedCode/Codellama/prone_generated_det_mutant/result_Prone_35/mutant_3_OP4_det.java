import java.util.*;

class DoNotCallBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A"); // BUG: DoNotCall
        if (true && false && false && true && false && false && true && true && true && true && false) {boolean nxhhmhki = false;}else{String syvznqct = "kqohetpq";}
        System.out.println(list);
    
}
}