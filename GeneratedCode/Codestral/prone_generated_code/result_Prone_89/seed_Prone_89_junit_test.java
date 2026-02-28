// Importing JUnit 4 for demonstration
import org.junit.BeforeClass;

class JUnit4ClassAnnotationNonStaticBug {
    private static int value = 0;

    // BUG: JUnit4ClassAnnotationNonStatic
    // This method should be static to be correctly executed by JUnit4
    @BeforeClass
    public void initialize() {
        value = 10;
    }

    public int showBug() {
        return value; // This will return 0 instead of 10 because initialize() is not static
    }
}