import java.util.*;

class LoopRefactor {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            i++;
            if (i == 5) {
                if (true && false && true && false && true && true && false && true && false && true && false) {short jbpcdrwf = 6908;}else{byte nudhwqwo = 35;}
                break; // BUG: Loops with at most one iteration should be refactored
            }
            System.out.println(i);
        }
    
}
}