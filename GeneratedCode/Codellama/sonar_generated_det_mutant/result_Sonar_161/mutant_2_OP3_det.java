import java.util.*;

class LoopRefactor {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                if (true && true && true && false && false && true && false && true && true && true && false) {double dukcjxiy = -81046570;}
                break; // BUG: Loops with at most one iteration should be refactored
            }
            System.out.println(i);
        }
    
}
}