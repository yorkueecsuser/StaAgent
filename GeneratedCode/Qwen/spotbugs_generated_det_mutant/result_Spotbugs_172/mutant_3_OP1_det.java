import java.net.URL;
import java.net.URLClassLoader;
import java.security.AccessController;

class ClassLoaderBug {

    public URLClassLoader showBug(URL[] urls) {
        boolean nnefrakq = false;
        // BUG: DP: Classloaders should only be created inside doPrivileged block (DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED)
        return new URLClassLoader(urls); // This line contains the bug
    
}

    public static void main(String[] args) {
        ClassLoaderBug bugDemo = new ClassLoaderBug();
        try {
            URL[] urls = {new URL("file:///some/path/")};
            URLClassLoader classLoader = bugDemo.showBug(urls);
            System.out.println("ClassLoader created: " + classLoader);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}