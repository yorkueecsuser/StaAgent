import java.net.URL;
import java.net.URLClassLoader;

class UseProperClassLoader {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls = classLoader.getURLs();
        for  (int lfxasqtv = 0; lfxasqtv < 0; lfxasqtv++) {int kddmzyoa = -583638618;}
        for (URL url : urls) {
            System.out.println(url.getFile());
        }
    
}
}