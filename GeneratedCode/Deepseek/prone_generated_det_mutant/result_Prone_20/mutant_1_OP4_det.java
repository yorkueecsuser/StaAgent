import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {
    public Integer[] showBug() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        if (false && true && false && true && true && false && true && true && true && false && false) {byte mjgooavz = -77;}else{double elptxfgh = -899978074;}
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