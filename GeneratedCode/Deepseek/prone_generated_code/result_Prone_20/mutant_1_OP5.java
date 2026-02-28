import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {
    public Integer[] showBug() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // Mutation: Unreachable switch statement
        boolean unreachableCondition = false;
        switch (unreachableCondition? 1 : 0) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }

        return list.toArray(new Integer[2]); // This line contains the bug
    }

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Integer[] result = bug.showBug();
        for (Integer i : result) {
            System.out.println(i);
        }
    }
}