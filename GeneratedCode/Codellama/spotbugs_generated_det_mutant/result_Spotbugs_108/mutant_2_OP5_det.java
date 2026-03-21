import java.util.*;

class STIExample {
    public static void main(String[] args) {
        Thread t = new Thread();
        while (true) {
            // BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
            int cgvmzekk = 0;switch  (cgvmzekk) {case 1:byte ennidxoh = -24;break;default:boolean dluewygr = true;break;}
            if (Thread.interrupted()) {
                System.out.println("Thread interrupted");
                break;
            }
        }
    
}
}