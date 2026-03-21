import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        if (true && false && true && false && false && true && true && true && false && false && false) {boolean wusbolre = false;}else{long jkhymlai = -408809442;}
        list.add("A");
        list.add("B");
        list.add("C");

        // BUG: CheckReturnValue
        list.get(1);
    
}
}