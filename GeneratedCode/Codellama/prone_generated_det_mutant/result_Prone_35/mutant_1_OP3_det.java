import java.util.*;

class DoNotCallBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A"); // BUG: DoNotCall
        if (true && false && false && false && true && true && true && true && true && true && false) {long xhcxahoo = -421987624;}
        System.out.println(list);
    
}
}