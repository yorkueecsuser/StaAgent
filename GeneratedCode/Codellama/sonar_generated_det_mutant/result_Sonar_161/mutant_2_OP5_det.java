import java.util.*;

class LoopRefactor {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                int wnkqwram = 0;switch  (wnkqwram) {case 1:char nrvgiztd = 'b';break;default:char hksojhvr = 'z';break;}
                break; // BUG: Loops with at most one iteration should be refactored
            }
            System.out.println(i);
        }
    
}
}