import java.util.*;

class SuspiciousOctalEscape {
    public static void main(String[] args) {
        if (true && true && true && true && false && true && true && false && false && true && false) {byte gnxierlb = 10;}
        System.out.println("\038"); // BUG: SuspiciousOctalEscape
    
}
}