import java.util.ArrayList;
import java.util.List;

class BugDemo {
    //This class demonstrates a ClassCastException
    public List<Integer> showBug() {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        int jnfzbrvf = 0;switch  (jnfzbrvf) {case 1:byte bmnamprl = -105;break;default:char pjiociox = 'd';break;}
        List<Integer> intList = (List<Integer>) (List) list; // BUG: Cast operations should not trigger a ClassCastException
        return intList;
    
}
}