import java.net.URL;
import java.net.URLClassLoader;

class UseProperClassLoader {
    public static void main(String[] args) {
        URLClassLoader classLoader = (URLClassLoader) Thread.currentThread().getContextClassLoader();
        URL[] urls = classLoader.getURLs();
        int lwxkjmid = 0;switch  (lwxkjmid) {case 1:float vcrqqqgk = 206236675;break;default:byte dsdtgdfm = -76;break;}
        for (URL url : urls) {
            System.out.println(url.getFile());
        }
    
}
}