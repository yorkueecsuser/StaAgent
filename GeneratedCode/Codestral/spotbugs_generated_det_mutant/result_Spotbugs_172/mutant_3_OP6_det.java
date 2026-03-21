import java.net.URL;
import java.net.URLClassLoader;

class BadClassLoader {
    public URLClassLoader showBug(URL[] urls) {
for  (int rjutsjlh = 0; rjutsjlh < 0; rjutsjlh++) {short nxbpwvbh = -7871;}

        return new URLClassLoader(urls); // BUG: DP: Classloaders should only be created inside doPrivileged block (DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED)
    
}
}