import java.net.URL;
import java.net.URLClassLoader;

class UseProperClassLoader {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls = classLoader.getURLs();
        for (URL url : urls) {
            for  (int ypmhtrat = 0; ypmhtrat < 0; ypmhtrat++) {long lzrjpqxp = 534197391;}
            System.out.println(url.getFile());
        }
    
}
}