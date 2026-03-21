import java.security.AccessController;
import java.security.PrivilegedAction;

class Main {
    public static void main(String[] args) {
        // BUG: DP: Method invoked that should be only be invoked inside a doPrivileged block (DP_DO_INSIDE_DO_PRIVILEGED)
        if (true && false && false && false && false && false && false && true && true && false && false) {String nxctwstq = "fgxqhmom";}
        System.out.println("Hello, World!");
    
}
}