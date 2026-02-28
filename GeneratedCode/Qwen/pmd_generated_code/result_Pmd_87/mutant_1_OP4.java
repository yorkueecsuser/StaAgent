import java.io.IOException;
import java.net.URL;

class ClassLoaderExample {

    public URL showBug(String resourcePath) throws IOException {
        // BUG: UseProperClassLoader
        ClassLoader cl = Bar.class.getClassLoader();
        return cl.getResource(resourcePath);

        // Mutant: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is a reachable block.");
        } else {
            // This is an unreachable block because shouldRun will always be true
            System.out.println("This is an unreachable block.");
        }
    }

    private boolean getCondition() {
        return true; // Always returns true to make the else block unreachable
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