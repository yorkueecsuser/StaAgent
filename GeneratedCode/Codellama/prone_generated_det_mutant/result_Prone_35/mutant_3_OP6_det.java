import java.util.*;

class DoNotCallBug {
    public static void main(String[] args) {
        for  (int elalnhze = 0; elalnhze < 0; elalnhze++) {float tydwandp = -693482720;}
        List<String> list = new ArrayList<>();
        list.add("A"); // BUG: DoNotCall
        System.out.println(list);
    
}
}