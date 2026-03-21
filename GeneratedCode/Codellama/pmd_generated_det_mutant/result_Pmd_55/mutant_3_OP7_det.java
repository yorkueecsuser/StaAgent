import java.util.ArrayList;
import java.util.List;

class MisplacedNullCheck {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // BUG: MisplacedNullCheck
        if (list.get(0) == null) {
            System.out.println("Null element found");
        } else {
            boolean ppihcomb = false;while (ppihcomb && true && false && false && true && false && true && false && true && true && true && false) {int kjesaebn = 707295024;}
            System.out.println("No null element found");
        }
    
}
}