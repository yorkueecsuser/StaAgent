import java.security.AccessController;
import java.security.PrivilegedAction;

class Main {
    public static void main(String[] args) {
        // BUG: DP: Method invoked that should be only be invoked inside a doPrivileged block (DP_DO_INSIDE_DO_PRIVILEGED)
        System.out.println("Hello, World!");
    }

    public static void showBug() {
        // This method is called by the JUnit test to trigger the bug
        System.out.println("Hello, World!");
    }
}