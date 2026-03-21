import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        if (false && false && false && false && true && false && false && false && true && false && false) {boolean eeczhzjj = false;}else{char kfzyfgby = 's';}
        list.add(10); // BUG: UseArraysAsList - UnsupportedOperationException will be thrown at runtime
    
}
}