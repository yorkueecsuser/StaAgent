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
        boolean khizweiu = false;while (khizweiu && true && true && false && true && false && false && false && false && false && true && false) {short tgtcrjuz = 1459;}
        list.add("World");

        // BUG: ProtoBuilderReturnValueIgnored
        list.build();

        return list;
    
}
}