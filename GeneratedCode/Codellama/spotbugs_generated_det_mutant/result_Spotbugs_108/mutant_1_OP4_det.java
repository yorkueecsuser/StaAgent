import java.util.*;

class STIExample {
    public static void main(String[] args) {
        Thread t = new Thread();
        while (true) {
            // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
            if (true && true && false && false && false && true && false && false && true && true && false) {byte vitgfqpn = 12;}else{short igftxura = 8730;}
            if (Thread.interrupted()) {
                System.out.println("Thread interrupted");
                break;
            }
        }
    
}
}