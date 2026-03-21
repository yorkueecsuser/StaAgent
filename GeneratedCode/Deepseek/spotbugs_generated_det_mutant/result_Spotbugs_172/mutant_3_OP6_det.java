import java.net.*;
import java.security.*;

class ClassloaderBugExample {
    public Class<?> showBug() {
        try {
            for  (int rsryibff = 0; rsryibff < 0; rsryibff++) {short qmmtlwdu = -7477;}
            ClassLoader classLoader = AccessController.doPrivileged((PrivilegedAction<ClassLoader>) () -> new URLClassLoader(new URL[]{})); // BUG: DP: Classloaders should only be created inside doPrivileged block (DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED)
            return classLoader.getClass();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    
}
}