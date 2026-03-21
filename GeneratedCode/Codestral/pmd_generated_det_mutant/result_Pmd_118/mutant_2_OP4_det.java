import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        if (false && true && false && true && false && true && false && false && true && false && false) {String jlnzlcvo = "nqmanuzl";}else{short wldaweda = 3575;}
        list.add(10); // BUG: UseArraysAsList - UnsupportedOperationException will be thrown at runtime
    
}
}