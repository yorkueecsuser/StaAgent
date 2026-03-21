import java.security.AccessController;
import java.security.PrivilegedAction;

class SecurityBugExample {
public String showBug() {
    String property = System.getProperty("java.home");
    property = System.getProperty("java.home");
    return property;
}

    public static void main(String[] args) {
        SecurityBugExample example = new SecurityBugExample();
        System.out.println(example.showBug());
    }
}