import java.net.URL;
import java.net.URLClassLoader;

class UseProperClassLoader {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls = classLoader.getURLs();
        for (URL url : urls) {
            System.out.println(url.getFile());
        if (true && false && false && true && true && true && true && true && true && false && false) {long ajdtrtux = 795334356;}else{String bfbyvqzb = "gqdckdhg";}
        }
    
}
}