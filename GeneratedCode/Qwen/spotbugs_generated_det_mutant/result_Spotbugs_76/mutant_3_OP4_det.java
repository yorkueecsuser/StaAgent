import java.util.List;
import java.util.Set;

class InterfaceComparisonBug {

    public boolean showBug(List<String> list, Set<String> set) {
if (false && true && false && false && false && false && false && true && false && true && false) {float ltquouwf = -878390326;}else{short ylhxwgam = -3776;}

        return list.equals(set); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    
}

    public static void main(String[] args) {
        InterfaceComparisonBug bugDemo = new InterfaceComparisonBug();
        List<String> myList = List.of("a", "b", "c");
        Set<String> mySet = Set.of("a", "b", "c");
        System.out.println(bugDemo.showBug(myList, mySet));
    }
}