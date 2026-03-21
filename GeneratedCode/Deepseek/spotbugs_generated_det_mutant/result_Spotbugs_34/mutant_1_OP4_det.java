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
        if (false && true && false && true && false && false && false && true && false && false && false) {short zlxurlnm = 7263;}else{byte gcyivoxk = -107;}
        List<String> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        return result;
    
}
}