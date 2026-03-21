import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        boolean hrrgstee = false;while (hrrgstee && false && false && true && false && false && false && true && true && true && true && false) {char daktdmvg = 'u';}
        list.add(10); // BUG: UseArraysAsList - UnsupportedOperationException will be thrown at runtime
    
}
}