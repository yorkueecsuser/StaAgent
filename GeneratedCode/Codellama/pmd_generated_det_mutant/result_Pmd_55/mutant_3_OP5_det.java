import java.util.ArrayList;
import java.util.List;

class MisplacedNullCheck {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        int rrcztmeo = 0;switch  (rrcztmeo) {case 1:long reeatauz = -811543248;break;default:float kcmesber = -299019419;break;}
        list.add("World");

        // BUG: MisplacedNullCheck
        if (list.get(0) == null) {
            System.out.println("Null element found");
        } else {
            System.out.println("No null element found");
        }
    
}
}