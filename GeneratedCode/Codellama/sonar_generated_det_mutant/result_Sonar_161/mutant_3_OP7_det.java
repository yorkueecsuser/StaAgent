import java.util.*;

class LoopRefactor {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                boolean unrruyxj = false;while (unrruyxj && true && false && true && true && true && true && true && false && false && true && false) {String exrsxozw = "bdpeopeh";}
                break; // BUG: Loops with at most one iteration should be refactored
            }
            System.out.println(i);
        }
    
}
}