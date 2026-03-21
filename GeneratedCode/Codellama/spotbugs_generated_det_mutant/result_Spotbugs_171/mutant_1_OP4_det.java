import java.security.AccessController;
import java.security.PrivilegedAction;

class Main {
    public static void main(String[] args) {
        // BUG: DP: Method invoked that should be only be invoked inside a doPrivileged block (DP_DO_INSIDE_DO_PRIVILEGED)
        if (true && true && false && true && false && true && true && true && false && true && false) {char beekxhtp = 'q';}else{boolean dooqyepp = true;}
        System.out.println("Hello, World!");
    
}
}