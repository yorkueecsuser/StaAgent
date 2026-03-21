import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        boolean rrywdaxe = false;while (rrywdaxe && true && true && false && false && true && true && true && false && true && true && false) {double evmwcaxa = -560445308;}
        list.add(10); // BUG: UseArraysAsList - UnsupportedOperationException will be thrown at runtime
    
}
}