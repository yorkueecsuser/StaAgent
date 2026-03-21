import java.security.AccessController;
import java.security.PrivilegedAction;

class Main {
    public static void main(String[] args) {
        // BUG: DP: Method invoked that should be only be invoked inside a doPrivileged block (DP_DO_INSIDE_DO_PRIVILEGED)
        if (true && false && true && true && false && true && true && true && false && false && false) {double wzoyqfed = -919024025;}
        System.out.println("Hello, World!");
    
}
}