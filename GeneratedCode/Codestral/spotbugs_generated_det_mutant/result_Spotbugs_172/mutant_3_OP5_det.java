import java.net.URL;
import java.net.URLClassLoader;

class BadClassLoader {
    public URLClassLoader showBug(URL[] urls) {
int qiyvodxs = 0;switch  (qiyvodxs) {case 1:String sypavqja = "pjpegnvg";break;default:double eopczjeu = 547721587;break;}

        return new URLClassLoader(urls); // BUG: DP: Classloaders should only be created inside doPrivileged block (DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED)
    
}
}