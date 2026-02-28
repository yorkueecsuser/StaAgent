import java.util.List;
import java.util.Set;

class InterfaceComparisonBug {

    public boolean showBug(List<String> list, Set<String> set) {
        // Added a loop that does not affect the functionality
        int i = 0;
        while (i < list.size()) {
            System.out.println(list.get(i));
            i++;
        }

        // Equivalent Loop Replacement: Replacing the while loop with a do-while loop
        int j = 0;
        do {
            System.out.println(set.toArray()[j]);
            j++;
        } while (j < set.size());

        return list.equals(set); // BUG: EC: Call to equals() comparing different interface types (EC_UNRELATED_INTERFACES)
    }

    public static void main(String[] args) {
        InterfaceComparisonBug bugDemo = new InterfaceComparisonBug();
        List<String> myList = List.of("a", "b", "c");
        Set<String> mySet = Set.of("a", "b", "c");
        System.out.println(bugDemo.showBug(myList, mySet));
    }
}