import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        for  (int ozvrkzee = 0; ozvrkzee < 0; ozvrkzee++) {short gkrqilun = 6907;}
        list.add(10); // BUG: UseArraysAsList - UnsupportedOperationException will be thrown at runtime
    
}
}