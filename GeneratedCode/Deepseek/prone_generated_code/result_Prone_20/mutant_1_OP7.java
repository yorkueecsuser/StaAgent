import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {
    public Integer[] showBug() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Mutation: Adding an unreachable while loop
        boolean unreachableCondition = false; // Mutation: Compile-time constant replaced with a non-final variable
        while (unreachableCondition) { // Mutation: Loop condition is non-final variable
            System.out.println("This is an unreachable loop");
        }

        return list.toArray(new Integer[2]);
    }

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Integer[] result = bug.showBug();
        for (Integer i : result) {
            System.out.println(i);
        }
    }
}