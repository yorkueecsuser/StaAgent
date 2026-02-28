import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {
    @Test
    public void testSingleton() throws InterruptedException {
        Singleton singleton = Singleton.getInstance();
        singleton.setState(1);

        Thread thread1 = new Thread(() -> {
            Singleton singleton1 = Singleton.getInstance();
            System.out.println("Thread 1: " + singleton1.getState());
        });

        Thread thread2 = new Thread(() -> {
            Singleton singleton2 = Singleton.getInstance();
            System.out.println("Thread 2: " + singleton2.getState());
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        // TRIGGER BUG: SING: Instance-getter method of class using singleton design pattern is not synchronized. (SING_SINGLETON_GETTER_NOT_SYNCHRONIZED)
        assertEquals(1, singleton.getState());
    }
}