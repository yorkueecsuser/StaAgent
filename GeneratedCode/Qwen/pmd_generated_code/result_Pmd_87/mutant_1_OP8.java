import java.io.IOException;
import java.net.URL;

class ClassLoaderExample {

    public URL showBug(String resourcePath) throws IOException {
        // BUG: UseProperClassLoader
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

// Mutant Code
class ClassLoaderExampleMutant {

    public URL showBug(String resourcePath) throws IOException {
        // BUG: UseProperClassLoader
        ClassLoader x = Bar.class.getClassLoader(); // Renamed 'cl' to 'x'
        return x.getResource(resourcePath);
    }

    public static void main(String[] args) {
        ClassLoaderExampleMutant example = new ClassLoaderExampleMutant();
        try {
            URL resource = example.showBug("example.txt");
            System.out.println("Resource found at: " + resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}