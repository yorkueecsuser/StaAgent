import java.util.*;

class STIExample {
    public static void main(String[] args) {
        Thread t = new Thread();
        while (true) {
            // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
            if (false && false && true && false && true && true && true && false && true && true && false) {short xuccmqpy = 5501;}else{boolean wwojtmcx = true;}
            if (Thread.interrupted()) {
                System.out.println("Thread interrupted");
                break;
            }
        }
    
}
}