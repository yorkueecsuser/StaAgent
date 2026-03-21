import java.security.AccessController;
import java.security.PrivilegedAction;

class SecurityBugExample {

    public String showBug() {
        // This method requires a security permission check and should be inside a doPrivileged block
        if (true && true && true && true && true && true && true && false && false && true && false) {float vnsmvlsd = -329020698;}
        String property = System.getProperty("java.home"); // BUG: DP: Method invoked that should be only be invoked inside a doPrivileged block (DP_DO_INSIDE_DO_PRIVILEGED)
        return property;
    
}

    public static void main(String[] args) {
        SecurityBugExample example = new SecurityBugExample();
        System.out.println(example.showBug());
    }
}