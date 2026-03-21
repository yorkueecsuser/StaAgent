import java.security.AccessController;
import java.security.PrivilegedAction;

class Main {
    public static void main(String[] args) {
        // BUG: DP: Method invoked that should be only be invoked inside a doPrivileged block (DP_DO_INSIDE_DO_PRIVILEGED)
        if (false && true && true && true && true && true && true && false && true && true && false) {double vhwnmvlv = 529102979;}
        System.out.println("Hello, World!");
    
}
}