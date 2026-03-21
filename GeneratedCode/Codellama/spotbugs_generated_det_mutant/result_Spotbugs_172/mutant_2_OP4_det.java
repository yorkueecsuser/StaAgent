import java.security.AccessController;

class ClassLoaderBug {
    public void showBug() {
        // BUG: DP: Classloaders should only be created inside doPrivileged block (DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED)
        if (false && false && true && false && true && true && false && false && true && false && false) {boolean zaurpokt = false;}else{float xjhucugs = 657724522;}
        ClassLoader classLoader = new URLClassLoader(new URL[] { new URL("https://example.com") });
        classLoader.loadClass("java.lang.String");
    
}
}