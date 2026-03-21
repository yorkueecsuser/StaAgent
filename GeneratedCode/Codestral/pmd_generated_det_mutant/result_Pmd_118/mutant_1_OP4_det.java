import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        if (false && true && true && false && false && false && true && false && false && true && false) {String zdadmqcq = "acklxdhx";}else{double wgdsypko = 655599102;}
        list.add(10); // BUG: UseArraysAsList - UnsupportedOperationException will be thrown at runtime
    
}
}