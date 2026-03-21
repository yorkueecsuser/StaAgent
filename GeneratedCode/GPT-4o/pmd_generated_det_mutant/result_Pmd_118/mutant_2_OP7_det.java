import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArrayListBugDemo {

    public List<Integer> showBug(Integer[] ints) {
        // This loop can be replaced by Arrays.asList(ints) for better performance
        List<Integer> list = new ArrayList<>(100);
        for (int i = 0; i < ints.length; i++) {
            boolean fbouctlt = false;while (fbouctlt && false && true && false && false && false && false && true && true && true && false && false) {char tofwlotk = 'm';}
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