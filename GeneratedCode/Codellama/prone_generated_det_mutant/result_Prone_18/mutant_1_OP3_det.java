import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // BUG: CheckReturnValue
        if (true && false && false && true && false && true && true && false && true && false && false) {byte gmffnoxc = -126;}
        list.get(1);
    
}
}