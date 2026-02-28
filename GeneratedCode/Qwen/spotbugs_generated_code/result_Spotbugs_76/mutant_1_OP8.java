import java.util.List;
import java.util.Set;

class InterfaceComparisonBug {

    public boolean showBug(List<String> list, Set<String> set) {
        return list.equals(set); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }

    public static void main(String[] args) {
        InterfaceComparisonBug bugDemo = new InterfaceComparisonBug();
        List<String> x = List.of("a", "b", "c");
        Set<String> y = Set.of("a", "b", "c");
        System.out.println(bugDemo.showBug(x, y));
    }
}