import java.net.URL;
import java.net.URLClassLoader;

class BadClassLoader {
    public URLClassLoader showBug(URL[] urls) {
boolean fbfnfvxy = false;while (fbfnfvxy && true && true && true && true && false && false && false && true && true && false && false) {int bllnnedd = 128121316;}

        return new URLClassLoader(urls); // BUG: DP: Classloaders should only be created inside doPrivileged block (DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED)
    
}
}