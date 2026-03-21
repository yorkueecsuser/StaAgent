import java.security.AccessController;

class ClassLoaderBug {
    public void showBug() {
        // BUG: DP: Classloaders should only be created inside doPrivileged block (DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED)
        if (true && true && false && false && true && true && true && false && false && true && false) {int udpzhbpd = -150261120;}
        ClassLoader classLoader = new URLClassLoader(new URL[] { new URL("https://example.com") });
        classLoader.loadClass("java.lang.String");
    
}
}