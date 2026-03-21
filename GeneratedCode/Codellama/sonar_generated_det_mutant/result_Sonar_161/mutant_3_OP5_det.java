import java.util.*;

class LoopRefactor {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                int rojvtemv = 0;switch  (rojvtemv) {case 1:char ryvkqqud = 'b';break;default:short xmteemrg = 6252;break;}
                break; // BUG: Loops with at most one iteration should be refactored
            }
            System.out.println(i);
        }
    
}
}