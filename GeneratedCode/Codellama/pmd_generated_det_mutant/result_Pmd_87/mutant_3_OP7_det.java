import java.net.URL;
import java.net.URLClassLoader;

class UseProperClassLoader {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls = classLoader.getURLs();
        for (URL url : urls) {
            boolean vpfasubg = false;while (vpfasubg && true && true && false && false && false && true && true && true && true && false && false) {byte bxjsrwbe = -97;}
            System.out.println(url.getFile());
        }
    
}
}