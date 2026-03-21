import java.util.ArrayList;
import java.util.List;

class MisplacedNullCheck {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // BUG: MisplacedNullCheck
        boolean izodtfvy = false;while (izodtfvy && false && false && false && false && true && false && true && true && true && true && false) {long cpqbzuyr = -758157230;}
        if (list.get(0) == null) {
            System.out.println("Null element found");
        } else {
            System.out.println("No null element found");
        }
    
}
}