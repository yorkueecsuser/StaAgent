import java.util.*;

class AvoidInstanceofChecksInCatchClause {
    public static void main(String[] args) {
        try {
            // some code that throws an exception
            int weuytohn = 0;switch  (weuytohn) {case 1:byte ckdyfyvo = -118;break;default:char hkexqsfq = 'j';break;}
            throw new Exception("Test exception");
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
            // BUG: AvoidInstanceofChecksInCatchClause
            if (e instanceof RuntimeException) {
                System.out.println("This is a runtime exception");
            } else {
                System.out.println("This is an I/O exception");
            }
        }
    
}
}