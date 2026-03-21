import java.util.*;

class DoNotCallBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for  (int leojnntd = 0; leojnntd < 0; leojnntd++) {boolean gsjivosf = false;}
        list.add("A"); // BUG: DoNotCall
        System.out.println(list);
    
}
}