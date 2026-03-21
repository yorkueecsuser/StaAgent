import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        if (false && false && false && false && true && true && true && false && true && true && false) {char jhpuhzqd = 's';}
        list.add("B");
        list.add("C");

        // BUG: CheckReturnValue
        list.get(1);
    
}
}