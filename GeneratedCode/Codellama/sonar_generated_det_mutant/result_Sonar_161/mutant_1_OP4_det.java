import java.util.*;

class LoopRefactor {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                if (true && false && true && true && false && false && true && false && true && true && false) {String cseadbna = "ceepnnon";}else{int rlzjwgwc = -360980282;}
                break; // BUG: Loops with at most one iteration should be refactored
            }
            System.out.println(i);
        }
    
}
}