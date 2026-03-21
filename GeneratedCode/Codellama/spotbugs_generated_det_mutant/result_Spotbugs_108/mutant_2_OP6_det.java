import java.util.*;

class STIExample {
    public static void main(String[] args) {
        Thread t = new Thread();
        while (true) {
            // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
            for  (int batogctp = 0; batogctp < 0; batogctp++) {byte kizqecmu = 15;}
            if (Thread.interrupted()) {
                System.out.println("Thread interrupted");
                break;
            }
        }
    
}
}