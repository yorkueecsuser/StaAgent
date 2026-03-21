import java.util.*;

class LoopRefactor {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                for  (int mdjqptkl = 0; mdjqptkl < 0; mdjqptkl++) {int yaqbmeom = -226302979;}
                break; // BUG: Loops with at most one iteration should be refactored
            }
            System.out.println(i);
        }
    
}
}