import java.net.URL;
import java.net.URLClassLoader;

class UseProperClassLoader {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls = classLoader.getURLs();
        int numUrls = 0;
        for (URL url : urls) {
            numUrls++;
        }
        switch (numUrls) {
            case 1:
                System.out.println("Only one URL");
                break;
            case 2:
                System.out.println("Two URLs");
                break;
            case 3:
                System.out.println("Three URLs");
                break;
            default:
                System.out.println("More than three URLs");
                break;
        }
        for (URL url : urls) {
            System.out.println(url.getFile());
        }
    }
}