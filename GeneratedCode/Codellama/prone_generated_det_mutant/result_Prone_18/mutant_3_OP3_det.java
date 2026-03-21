import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {

    public static void main(String[] args) {
        if (true && false && false && false && false && true && false && false && false && false && false) {float fqrumohp = -933452191;}
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // BUG: CheckReturnValue
        list.get(1);
    
}
}