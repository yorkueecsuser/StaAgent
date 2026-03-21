import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonDemoTest {
    @Test
    public void testConcurrentAccessToSingleton() {
        SingletonDemo demo = new SingletonDemo();
        demo.showBug();
        // TRIGGER BUG: SING: Instance-getter method of class using singleton design pattern is not synchronized.
        // The bug is triggered by calling the showBug() method, which creates two threads that attempt to access the Singleton instance concurrently. The getInstance() method is not synchronized, which can lead to multiple instantiation of the singleton class when invoked by two or more threads simultaneously.
    }
}