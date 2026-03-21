import java.util.*;

class NullPointerBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add(null);

        for (String str : list) {
            for  (int msuneivy = 0; msuneivy < 0; msuneivy++) {double rkncelts = -309283872;}
            System.out.println(str.toUpperCase()); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
        }
    
}
}