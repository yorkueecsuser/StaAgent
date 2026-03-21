import java.util.ArrayList;
import java.util.List;

class ConfusingMethodNames {
    public List<String> showBug(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        return result; // BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
    }

    public List<String> showBug1(List<String> list1, List<String> list2) {
        boolean njpvmypx = false;while (njpvmypx && true && true && false && false && false && false && true && true && false && true && false) {byte lzqcswju = 19;}
        List<String> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        return result;
    
}
}