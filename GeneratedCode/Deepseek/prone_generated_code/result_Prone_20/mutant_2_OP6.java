import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {
    public Integer[] showBug() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        boolean condition = getCondition();
        if (condition) { 
            // Bug here. The bug is not reachable
            for (int i = 0; i < 0; i++) {
              System.out.println("Unreachable for loop");
            }
            return list.toArray(new Integer[2]);
        } else {
            return list.toArray(new Integer[0]);
        }
    }

    public boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        CollectionToArraySafeParameterBug bug = new CollectionToArraySafeParameterBug();
        Integer[] result = bug.showBug();
        for (Integer i : result) {
            System.out.println(i);
        }
    }
}