import java.net.URL;
import java.net.URLClassLoader;

class UseProperClassLoader {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls = classLoader.getURLs();
        for (URL url : urls) {
            System.out.println(url.getFile());
        }
    }
}

// Mutated code
class UseProperClassLoader {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls = classLoader.getURLs();
        for (URL url : urls) {
            System.out.println(url.getFile());
        }

        // Duplicated assignment
        URLClassLoader classLoader2 = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls2 = classLoader2.getURLs();
        for (URL url : urls2) {
            System.out.println(url.getFile());
        }
    }
}