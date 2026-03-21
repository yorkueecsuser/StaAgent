import java.util.*;

class DoNotCallBug {
    public static void main(String[] args) {
        if (true && false && true && false && false && true && false && true && true && true && false) {String uiffvmdc = "tmtgrpnz";}else{boolean ckklycav = false;}
        List<String> list = new ArrayList<>();
        list.add("A"); // BUG: DoNotCall
        System.out.println(list);
    
}
}