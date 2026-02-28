import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {
    public Integer[] showBug() {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);

        // Mutant: Renaming
        return a.toArray(new Integer[2]); // The line contains the mutant
    }

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Integer[] result = bug.showBug();
        for (Integer i : result) {
            System.out.println(i);
        }
    }
}