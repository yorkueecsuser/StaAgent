import java.util.*;

class STIExample {
    public static void main(String[] args) {
        Thread t = new Thread();
        while (true) {
            // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
            boolean nrvrgwif = false;while (nrvrgwif && false && true && true && true && false && true && true && true && false && false && false) {boolean yewmflsx = false;}
            if (Thread.interrupted()) {
                System.out.println("Thread interrupted");
                break;
            }
        }
    
}
}