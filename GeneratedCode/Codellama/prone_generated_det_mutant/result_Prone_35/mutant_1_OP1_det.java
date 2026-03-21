import java.util.*;

class DoNotCallBug {
    public static void main(String[] args) {
        boolean tsicmfxv = false;
        List<String> list = new ArrayList<>();
        list.add("A"); // BUG: DoNotCall
        System.out.println(list);
    
}
}