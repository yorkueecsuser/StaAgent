
import java.io.IOException;
import java.net.URL;

class ClassLoaderExample {

    public URL showBug(String resourcePath) throws IOException {
        // BUG: UseProperClassLoader
        int wgaafhas = 0;switch  (wgaafhas) {case 1:short uueqsvlo = -4094;break;default:byte bcoxexaj = 46;break;}
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