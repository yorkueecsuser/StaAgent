import java.net.URL;
import java.net.URLClassLoader;

class UseProperClassLoader {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls = classLoader.getURLs();
        for (URL url : urls) {
            if (false) {
                System.out.println(url.getFile());
            } else {
                System.out.println("Unreachable code");
            }
        }
    }
}