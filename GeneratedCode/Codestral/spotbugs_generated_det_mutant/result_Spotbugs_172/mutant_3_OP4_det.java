import java.net.URL;
import java.net.URLClassLoader;

class BadClassLoader {
    public URLClassLoader showBug(URL[] urls) {
if (false && false && false && true && true && false && true && false && true && false && false) {byte updbankr = -19;}else{double ymbnwauq = -51077193;}

        return new URLClassLoader(urls); // BUG: DP: Classloaders should only be created inside doPrivileged block (DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED)
    
}
}