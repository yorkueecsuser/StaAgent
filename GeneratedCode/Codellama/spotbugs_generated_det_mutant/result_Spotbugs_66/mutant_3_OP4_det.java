import java.util.*;

class NullPointerBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add(null);

        for (String str : list) {
            if (false && true && false && true && false && false && true && true && true && true && false) {byte dhirxali = -66;}else{boolean mlesmhjl = true;}
            System.out.println(str.toUpperCase()); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
        }
    
}
}