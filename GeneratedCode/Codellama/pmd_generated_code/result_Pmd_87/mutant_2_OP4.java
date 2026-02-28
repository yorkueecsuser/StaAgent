import java.net.URL;
import java.net.URLClassLoader;

class UseProperClassLoader {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls = classLoader.getURLs();
        for (URL url : urls) {
            System.out.println(url.getFile());
        }

        // Unreachable if-else statement mutant
        boolean condition = getCondition();
        if (condition) {
            // This branch is unreachable
            System.out.println("This branch is unreachable");
        } else {
            // This branch is reachable
            System.out.println("This branch is reachable");
        }
    }

    private static boolean getCondition() {
        // Return a randomly generated boolean value
        return Math.random() > 0.5;
    }
}