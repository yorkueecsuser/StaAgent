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

        for  (int ovbcjgfz = 0; ovbcjgfz < 0; ovbcjgfz++) {byte cbvbbide = -95;}
        // BUG: ProtoBuilderReturnValueIgnored
        list.build();

        return list;
    
}
}