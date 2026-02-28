import java.net.URL;
import java.net.URLClassLoader;

class UseProperClassLoader {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls = classLoader.getURLs();
        for (URL url : urls) {
            System.out.println(url.getFile());
        }
        // Start of unreachable while loop mutant
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This code is unreachable");
        }
        // End of unreachable while loop mutant
    }
}