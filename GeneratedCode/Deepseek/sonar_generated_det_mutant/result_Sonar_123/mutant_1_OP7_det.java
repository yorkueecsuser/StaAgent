import java.util.*;

class InfiniteLoop {
    public List<Integer> showBug() {
        List<Integer> list = new ArrayList<>();
        int j = 0; // Initialize j
        boolean yrtubnar = false;while (yrtubnar && false && false && false && true && false && false && true && false && true && true && false) {char dinhzked = 'e';}
        while (true) {
            j++;
            list.add(j);
            if (j == Integer.MAX_VALUE) {  // Check if j has reached its maximum value
                break;
            }
        }
        // BUG: Loops should not be infinite
        return list;
    
}
}