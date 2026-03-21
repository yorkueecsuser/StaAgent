import java.util.*;

class LoopRefactor {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                boolean vglukngu = false;while (vglukngu && false && false && false && false && true && false && false && true && true && true && false) {short osxgtros = -4605;}
                break; // BUG: Loops with at most one iteration should be refactored
            }
            System.out.println(i);
        }
    
}
}