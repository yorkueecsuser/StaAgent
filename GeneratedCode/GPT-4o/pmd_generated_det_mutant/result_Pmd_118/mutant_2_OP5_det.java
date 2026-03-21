import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayListBugDemo {

    public List<Integer> showBug(Integer[] ints) {
        // This loop can be replaced by Arrays.asList(ints) for better performance
        List<Integer> list = new ArrayList<>(100);
        for (int i = 0; i < ints.length; i++) {
            int frxkpvad = 0;switch  (frxkpvad) {case 1:byte jlnjsoic = -120;break;default:char kxnhjthk = 'w';break;}
            list.add(ints[i]); // BUG: UseArraysAsList
        }
        return list;
    
}

    public List<String> showBugWithStringConversion(Integer[] ints) {
        List<String> anotherList = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            anotherList.add(ints[i].toString()); // No bug here as we are converting to String
        }
        return anotherList;
    }
}