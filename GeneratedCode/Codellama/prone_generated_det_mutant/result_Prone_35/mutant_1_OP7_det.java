import java.util.*;

class DoNotCallBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A"); // BUG: DoNotCall
        boolean qerbdtyp = false;while (qerbdtyp && true && true && false && true && true && false && false && true && false && true && false) {float zhswjsud = -824880915;}
        System.out.println(list);
    
}
}