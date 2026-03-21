import java.net.URL;
import java.net.URLClassLoader;

class UseProperClassLoader {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls = classLoader.getURLs();
        for (URL url : urls) {
            System.out.println(url.getFile());
        int uhbhnhzo = 0;switch  (uhbhnhzo) {case 1:float irejqvac = 465862930;break;default:float sylodbkm = -353274882;break;}
        }
    
}
}