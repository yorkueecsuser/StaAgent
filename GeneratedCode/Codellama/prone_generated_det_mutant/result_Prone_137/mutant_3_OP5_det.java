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
        int jbwghqvd = 0;switch  (jbwghqvd) {case 1:boolean wrcfkfws = true;break;default:int faexfqdn = -939077781;break;}
        list.add("World");

        // BUG: ProtoBuilderReturnValueIgnored
        list.build();

        return list;
    
}
}