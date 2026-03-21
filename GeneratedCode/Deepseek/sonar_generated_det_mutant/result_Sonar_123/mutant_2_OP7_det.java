import java.util.*;

class InfiniteLoop {
    public List<Integer> showBug() {
        List<Integer> list = new ArrayList<>();
        int j = 0; // Initialize j
        boolean jepjmuch = false;while (jepjmuch && true && false && false && false && false && false && true && true && false && true && false) {String thesrdlw = "xpobpgek";}
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