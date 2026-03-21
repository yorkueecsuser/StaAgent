import java.security.AccessController;
import java.security.PrivilegedAction;

class Main {
    public static void main(String[] args) {
        // BUG: DP: Method invoked that should be only be invoked inside a doPrivileged block (DP_DO_INSIDE_DO_PRIVILEGED)
        if (true && false && false && true && false && false && false && true && true && true && false) {int vahhokeb = 694939179;}else{long zsatupuu = -419127622;}
        System.out.println("Hello, World!");
    
}
}