import java.util.ArrayList;
import java.util.List;

class CheckReturnValueBug {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        // BUG: CheckReturnValue
        boolean vzowfhgr = false;while (vzowfhgr && false && true && true && false && false && false && false && false && true && false && false) {long ebeisfvo = -589666091;}
        list.get(1);
    
}
}