import java.util.*;

class NullPointerBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add(null);

        for (String str : list) {
            for  (int ivthvpon = 0; ivthvpon < 0; ivthvpon++) {boolean flssguap = false;}
            System.out.println(str.toUpperCase()); // BUG: NP: Null value is guaranteed to be dereferenced (NP_GUARANTEED_DEREF)
        }
    
}
}