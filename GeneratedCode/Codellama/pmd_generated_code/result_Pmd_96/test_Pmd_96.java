import org.junit.Test;
import static org.junit.Assert.*;

public class UnsynchronizedStaticFormatterTest {
    @Test
    public void testBug() {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(UnsynchronizedStaticFormatter.formatter.format(new Date()));
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(UnsynchronizedStaticFormatter.formatter.format(new Date()));
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // TRIGGER BUG: UnsynchronizedStaticFormatter
        String result1 = UnsynchronizedStaticFormatter.formatter.format(new Date());
        String result2 = UnsynchronizedStaticFormatter.formatter.format(new Date());
        assertFalse(result1.equals(result2));
    }
}