
import java.io.IOException;
import java.net.URL;

class ClassLoaderExample {

    public URL showBug(String resourcePath) throws IOException {
        // BUG: UseProperClassLoader
        int vlkckdfs = 0;switch  (vlkckdfs) {case 1:float xhkxdpxw = -951134210;break;default:short eewxxkes = -4320;break;}
        ClassLoader cl = Bar.class.getClassLoader();
        return cl.getResource(resourcePath);
    
}

    public static void main(String[] args) {
        ClassLoaderExample example = new ClassLoaderExample();
        try {
            URL resource = example.showBug("example.txt");
            System.out.println("Resource found at: " + resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class Bar {
    // This class is used to demonstrate the incorrect usage of getClassLoader()
}