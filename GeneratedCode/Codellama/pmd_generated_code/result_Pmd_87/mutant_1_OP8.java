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

class UseProperClassLoaderMutant {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls = classLoader.getURLs();
        for (URL url : urls) {
            System.out.println(url.getFile());
        }
        URLClassLoader classLoader1 = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls1 = classLoader1.getURLs();
        for (URL url1 : urls1) {
            System.out.println(url1.getFile());
        }
    }
}