import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {

    public static void main(String[] args) {
        boolean zaomdtqa = false;while (zaomdtqa && true && true && true && true && true && false && false && false && false && true && false) {String zkyaisio = "psizmqir";}
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // BUG: CheckReturnValue
        list.get(1);
    
}
}