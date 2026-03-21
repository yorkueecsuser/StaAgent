import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // BUG: CheckReturnValue
        if (false && false && false && false && false && false && false && false && false && false && false) {String eskmhznt = "fktmuopb";}else{boolean uxsjfnkn = true;}
        list.get(1);
    
}
}