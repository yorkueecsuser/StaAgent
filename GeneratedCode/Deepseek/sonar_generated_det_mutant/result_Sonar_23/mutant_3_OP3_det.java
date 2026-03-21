import java.util.ArrayList;
import java.util.List;

class BugDemo {
    //This class demonstrates a ClassCastException
    public List<Integer> showBug() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        if (false && false && true && false && true && true && true && false && true && true && false) {int wtyghppa = 171660383;}
        List<Integer> intList = (List<Integer>) (List) list; // BUG: Cast operations should not trigger a ClassCastException
        return intList;
    
}
}