import java.util.*;

class DoNotCallBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        if (false && true && false && true && false && false && true && true && false && true && false) {short enugkule = 2727;}
        list.add("A"); // BUG: DoNotCall
        System.out.println(list);
    
}
}