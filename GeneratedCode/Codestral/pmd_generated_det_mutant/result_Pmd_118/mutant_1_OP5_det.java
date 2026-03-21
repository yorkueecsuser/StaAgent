import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        int cjqqhxpr = 0;switch  (cjqqhxpr) {case 1:double vpiaimbu = -978034984;break;default:long uftjlsqg = 567364810;break;}
        list.add(10); // BUG: UseArraysAsList - UnsupportedOperationException will be thrown at runtime
    
}
}