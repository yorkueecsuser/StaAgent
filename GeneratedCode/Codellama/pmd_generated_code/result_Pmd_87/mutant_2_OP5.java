import java.net.URL;
import java.net.URLClassLoader;

class UseProperClassLoader {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls = classLoader.getURLs();
        for (URL url : urls) {
            System.out.println(url.getFile());
        }

        // Unreachable switch statement mutant
        switch(false) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                System.out.println("This code is unreachable");
                break;
        }
    }
}