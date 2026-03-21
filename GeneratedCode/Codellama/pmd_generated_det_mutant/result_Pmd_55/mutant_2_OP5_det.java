import java.util.ArrayList;
import java.util.List;

class MisplacedNullCheck {
    public static void main(String[] args) {
        int sqafjvgk = 0;switch  (sqafjvgk) {case 1:float vbcluoaa = -879197431;break;default:int lbfelwkj = 113749662;break;}
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // BUG: MisplacedNullCheck
        if (list.get(0) == null) {
            System.out.println("Null element found");
        } else {
            System.out.println("No null element found");
        }
    
}
}