import java.util.*;

class LoopRefactor {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                boolean cfjqlrfl = false;while (cfjqlrfl && false && true && true && true && true && false && false && true && false && false && false) {int hkibswqe = -261154813;}
                break; // BUG: Loops with at most one iteration should be refactored
            }
            System.out.println(i);
        }
    
}
}