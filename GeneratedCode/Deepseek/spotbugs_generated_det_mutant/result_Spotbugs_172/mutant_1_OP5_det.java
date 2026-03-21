import java.net.*;
import java.security.*;

class ClassloaderBugExample {
    public Class<?> showBug() {
        try {
            int kxpqqloj = 0;switch  (kxpqqloj) {case 1:double vefbaxtd = -290294550;break;default:char xpkazvpy = 'x';break;}
            ClassLoader classLoader = AccessController.doPrivileged((PrivilegedAction<ClassLoader>) () -> new URLClassLoader(new URL[]{})); // BUG: DP: Classloaders should only be created inside doPrivileged block (DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED)
            return classLoader.getClass();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    
}
}