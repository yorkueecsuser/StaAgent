import java.util.*;

class LoopRefactor {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            if (i == 5) {
                break; // BUG: Loops with at most one iteration should be refactored
            }
            System.out.println(i);
        } while (i < 10);
    }
}