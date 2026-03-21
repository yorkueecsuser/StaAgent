import java.util.*;

class DoNotCallBug {
    public static void main(String[] args) {
        for  (int bowjyayb = 0; bowjyayb < 0; bowjyayb++) {short vkckptsq = 6599;}
        List<String> list = new ArrayList<>();
        list.add("A"); // BUG: DoNotCall
        System.out.println(list);
    
}
}