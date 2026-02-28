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
            System.out.println("No null element found");
        }
    }
}