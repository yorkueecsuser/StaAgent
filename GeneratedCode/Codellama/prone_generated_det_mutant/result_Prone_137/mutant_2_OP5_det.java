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
        int qzjcwneh = 0;switch  (qzjcwneh) {case 1:int alttfafx = 578639263;break;default:char ghnqxuzo = 'd';break;}
        list.add("World");

        // BUG: ProtoBuilderReturnValueIgnored
        list.build();

        return list;
    
}
}