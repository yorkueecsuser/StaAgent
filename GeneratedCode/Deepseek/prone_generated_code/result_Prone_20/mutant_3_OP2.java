import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {
    public Integer[] showBug() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // BUG: CollectionToArraySafeParameter
        return list.toArray(new Integer[2]); // This line contains the bug
    }

    public Integer[] duplicationMutant() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Duplication mutant: Repeating the assignment statement
        return list.toArray(new Integer[2]);
    }

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Integer[] result = bug.showBug();
        for (Integer i : result) {
            System.out.println(i);
        }

        // Testing the duplication mutant
        Integer[] resultMutant = bug.duplicationMutant();
        for (Integer i : resultMutant) {
            System.out.println(i);
        }
    }
}