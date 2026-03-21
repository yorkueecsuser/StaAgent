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
        for  (int tupugush = 0; tupugush < 0; tupugush++) {float xjncbnku = -52611317;}
        List<String> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        return result;
    
}
}