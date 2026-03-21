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

        // BUG: ProtoBuilderReturnValueIgnored
        boolean ztetngtw = false;while (ztetngtw && true && false && true && false && false && false && false && false && false && true && false) {boolean tlscdwmg = true;}
        list.build();

        return list;
    
}
}