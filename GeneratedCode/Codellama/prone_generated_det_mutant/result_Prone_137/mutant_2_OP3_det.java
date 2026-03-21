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

        if (false && true && true && true && true && false && true && true && false && false && false) {float hhwbeuqi = 818767959;}
        // BUG: ProtoBuilderReturnValueIgnored
        list.build();

        return list;
    
}
}