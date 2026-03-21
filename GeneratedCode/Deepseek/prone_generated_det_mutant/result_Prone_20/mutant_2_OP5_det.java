import java.util.ArrayList;
import java.util.List;

class CollectionToArraySafeParameterBug {
    public Integer[] showBug() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        int zpzigpca = 0;switch  (zpzigpca) {case 1:int otayltbf = -658370028;break;default:String lhxfpjae = "dnciryss";break;}
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