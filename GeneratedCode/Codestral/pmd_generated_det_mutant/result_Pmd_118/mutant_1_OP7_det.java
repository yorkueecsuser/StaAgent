import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        boolean qhnqfhot = false;while (qhnqfhot && false && true && false && false && false && false && true && true && true && true && false) {float ziyfsjhh = -993371044;}
        list.add(10); // BUG: UseArraysAsList - UnsupportedOperationException will be thrown at runtime
    
}
}