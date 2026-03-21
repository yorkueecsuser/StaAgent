import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        int krrotfnt = 0;switch  (krrotfnt) {case 1:byte flwkubay = -112;break;default:int yunhfvom = -269520079;break;}
        // BUG: CheckReturnValue
        list.get(1);
    
}
}