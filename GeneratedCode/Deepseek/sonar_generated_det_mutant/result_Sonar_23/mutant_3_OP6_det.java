import java.util.ArrayList;
import java.util.List;

class BugDemo {
    //This class demonstrates a ClassCastException
    public List<Integer> showBug() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        for  (int ldvxezoj = 0; ldvxezoj < 0; ldvxezoj++) {float vuussusa = -151662940;}
        List<Integer> intList = (List<Integer>) (List) list; // BUG: Cast operations should not trigger a ClassCastException
        return intList;
    
}
}