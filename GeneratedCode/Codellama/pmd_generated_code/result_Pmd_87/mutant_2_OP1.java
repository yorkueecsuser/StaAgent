import java.net.URL;
import java.net.URLClassLoader;

class UseProperClassLoader {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls = classLoader.getURLs();
        String xgnsbktm = ""; // Dead Store
        for (URL url : urls) {
            System.out.println(url.getFile());
        }
    }
}