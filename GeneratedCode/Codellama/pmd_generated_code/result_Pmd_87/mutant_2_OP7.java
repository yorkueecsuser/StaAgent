import java.net.URL;
import java.net.URLClassLoader;

class UseProperClassLoader {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls = classLoader.getURLs();
        for (URL url : urls) {
            System.out.println(url.getFile());
        }
        
        // Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code is unreachable
            System.out.println("This is an unreachable while loop");
        }
    }
}