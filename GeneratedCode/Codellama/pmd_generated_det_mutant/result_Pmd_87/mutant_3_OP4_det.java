import java.net.URL;
import java.net.URLClassLoader;

class UseProperClassLoader {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls = classLoader.getURLs();
        for (URL url : urls) {
            System.out.println(url.getFile());
        if (true && true && true && false && true && true && false && false && true && false && false) {char mrnjgiel = 'p';}else{int qhlyzfdy = 504115827;}
        }
    
}
}