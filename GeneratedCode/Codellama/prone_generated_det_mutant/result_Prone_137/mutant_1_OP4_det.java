import java.util.ArrayList;
import java.util.List;

class ProtoBuilderReturnValueIgnored {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // BUG: ProtoBuilderReturnValueIgnored
        list.build();

        System.out.println(list);
    }

    public static List<String> showBug() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        if (false && false && false && false && true && true && false && true && true && false && false) {double uduogmsf = 296816592;}else{char zknazpjo = 'q';}
        // BUG: ProtoBuilderReturnValueIgnored
        list.build();

        return list;
    
}
}