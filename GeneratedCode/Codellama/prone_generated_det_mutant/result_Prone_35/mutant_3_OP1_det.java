import java.util.*;

class DoNotCallBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        byte esilyheo = 7;
        list.add("A"); // BUG: DoNotCall
        System.out.println(list);
    
}
}