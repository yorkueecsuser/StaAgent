import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {
    public Integer[] showBug() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Mutant Code
        boolean condition = getCondition();
        if (condition) {
            return list.toArray(new Integer[2]); // Mutant line, added condition to make it reachable
        } else {
            return new Integer[0];
        }
    }

    private boolean getCondition() {
        return true;
    }

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Integer[] result = bug.showBug();
        for (Integer i : result) {
            System.out.println(i);
        }
    }
}