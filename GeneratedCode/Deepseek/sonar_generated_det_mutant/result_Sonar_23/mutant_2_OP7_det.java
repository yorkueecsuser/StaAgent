import java.util.ArrayList;
import java.util.List;

class BugDemo {
    //This class demonstrates a ClassCastException
    public List<Integer> showBug() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        boolean jzfmsyaa = false;while (jzfmsyaa && true && true && true && true && true && false && true && false && true && false && false) {short ujeyowhh = -9563;}
        List<Integer> intList = (List<Integer>) (List) list; // BUG: Cast operations should not trigger a ClassCastException
        return intList;
    
}
}