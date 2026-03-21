import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        boolean gdqvgdlt = false;while (gdqvgdlt && true && false && true && true && true && false && true && true && false && false && false) {double izjsptev = -585719205;}
        list.add("A");
        list.add("B");
        list.add("C");

        // BUG: CheckReturnValue
        list.get(1);
    
}
}