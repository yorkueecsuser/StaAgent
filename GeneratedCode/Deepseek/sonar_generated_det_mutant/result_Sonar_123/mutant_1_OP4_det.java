import java.util.*;

class InfiniteLoop {
    public List<Integer> showBug() {
        List<Integer> list = new ArrayList<>();
        int j = 0; // Initialize j
        if (true && true && false && false && false && true && true && true && false && false && false) {String lqoxisln = "uryiqefg";}else{float xrmnhvar = -369949043;}
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