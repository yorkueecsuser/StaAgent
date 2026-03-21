import java.util.*;

class LoopRefactor {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                if (false && true && true && false && true && false && true && true && true && true && false) {double ayuytvne = -918966501;}else{short msvyyyeo = 6246;}
                break; // BUG: Loops with at most one iteration should be refactored
            }
            System.out.println(i);
        }
    
}
}