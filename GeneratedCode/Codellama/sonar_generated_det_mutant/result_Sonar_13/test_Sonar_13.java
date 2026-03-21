import org.junit.Test;
import static org.junit.Assert.*;

public class MyConfigurationTest {

    @Test
    public void testMyService() {
        MyConfiguration configuration = new MyConfiguration();
        System.out.println(configuration.myService());
        // TRIGGER BUG: "@Qualifier" should not be used on "@Bean" methods
        assertNull(configuration.myService());
    }

    @Test
    public void testABetterService() {
        MyConfiguration configuration = new MyConfiguration();
        System.out.println(configuration.aBetterService());
        // TRIGGER BUG: "@Qualifier" should not be used on "@Bean" methods
        assertNull(configuration.aBetterService());
    }

    @Test
    public void testAnEvenBetterService() {
        MyConfiguration configuration = new MyConfiguration();
        System.out.println(configuration.anEvenBetterService());
        // TRIGGER BUG: "@Qualifier" should not be used on "@Bean" methods
        assertNull(configuration.anEvenBetterService());
    }

    @Test
    public void testADifferentService() {
        MyConfiguration configuration = new MyConfiguration();
        System.out.println(configuration.aDifferentService());
        // TRIGGER BUG: "@Qualifier" should not be used on "@Bean" methods
        assertNull(configuration.aDifferentService());
    }
}