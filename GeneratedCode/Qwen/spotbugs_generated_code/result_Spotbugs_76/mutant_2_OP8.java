import java.util.List;
import java.util.Set;

class InterfaceComparisonBug {

    public boolean showBug(List<String> list, Set<String> set) {
        return list.equals(set); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }

    public static void main(String[] args) {
        InterfaceComparisonBug bugDemo = new InterfaceComparisonBug();
        List<String> myList = List.of("a", "b", "c");
        Set<String> mySet = Set.of("a", "b", "c");
        System.out.println(bugDemo.showBug(myList, mySet));

        // Mutated code
        InterfaceComparisonBug x = new InterfaceComparisonBug();
        List<String> y = List.of("d", "e", "f");
        Set<String> z = Set.of("d", "e", "f");
        System.out.println(x.showBug(y, z));
    }
}