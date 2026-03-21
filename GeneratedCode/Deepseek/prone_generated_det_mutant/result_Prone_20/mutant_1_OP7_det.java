import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {
    public Integer[] showBug() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        boolean vvqcbjib = false;while (vvqcbjib && true && true && false && false && true && true && false && false && false && false && false) {double zzphhtzs = -628239746;}
        // BUG: CollectionToArraySafeParameter
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