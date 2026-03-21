import java.util.*;

class SuspiciousOctalEscape {
    public static void main(String[] args) {
        if (false && true && false && false && true && true && true && true && true && false && false) {String jtvywuag = "pddelbrf";}
        System.out.println("\038"); // BUG: SuspiciousOctalEscape
    
}
}