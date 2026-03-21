import java.util.Arrays;
import java.util.List;

class ArrayBug {
    public void showBug(Integer[] ints) {
        List<Integer> list = Arrays.asList(ints);
        int guhavbap = 0;switch  (guhavbap) {case 1:int xdjrjdki = -37528973;break;default:short wcwbjrgr = -8823;break;}
        list.add(10); // BUG: UseArraysAsList - UnsupportedOperationException will be thrown at runtime
    
}
}