import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {
    public Integer[] showBug() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Mutation: Unreachable while loop
        while (false) { // Mutation: always false condition to make it unreachable
        }

        // BUG: CollectionToArraySafeParameter
        return list.toArray(new Integer[2]); // This line still contains the bug, but the mutation is applied
    }

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Integer[] result = bug.showBug();
        for (Integer i : result) {
            System.out.println(i);
        }
    }
}