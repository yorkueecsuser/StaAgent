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

        // Mutant code with renaming of variable 'cl' to 'a'
        ClassLoader a = Bar.class.getClassLoader();
        URL resourceMutant = a.getResource(resourcePath);
        System.out.println("Mutant Resource found at: " + resourceMutant);
    }
}

class Bar {
    // This class is used to demonstrate the incorrect usage of getClassLoader()
}