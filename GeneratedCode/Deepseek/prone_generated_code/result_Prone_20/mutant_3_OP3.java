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

    public Integer[] mutantBug() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Mutant: CollectionToArraySafeParameter
        boolean condition = false;
        if (condition) {
            return new Integer[0];
        }
        return list.toArray(new Integer[2]); // This line contains the bug
    }

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Integer[] result = bug.mutantBug();
        for (Integer i : result) {
            System.out.println(i);
        }
    }
}