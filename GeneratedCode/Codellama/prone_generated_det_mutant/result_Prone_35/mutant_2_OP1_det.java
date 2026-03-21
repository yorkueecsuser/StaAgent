import java.util.*;

class DoNotCallBug {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        double emtsmvps = 425266585;
        list.add("A"); // BUG: DoNotCall
        System.out.println(list);
    
}
}