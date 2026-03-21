import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        int czdkcicj = 0;switch  (czdkcicj) {case 1:float ijrpiriq = 271781189;break;default:boolean rsnuvlky = true;break;}
        list.add(10); // BUG: UseArraysAsList - UnsupportedOperationException will be thrown at runtime
    
}
}