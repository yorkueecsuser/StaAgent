import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadGroupExampleTest {

    @Test
    public void testShowBug() {
        ThreadGroupExample example = new ThreadGroupExample();
        ThreadGroup tg = example.showBug(); // TRIGGER BUG: AvoidThreadGroup
        assertNotNull(tg);
    }

    @Test
    public void testShowBug1() {
        ThreadGroupExample example = new ThreadGroupExample();
        ThreadGroup parentGroup = Thread.currentThread().getThreadGroup();
        ThreadGroup tg = example.showBug1(parentGroup); // TRIGGER BUG: AvoidThreadGroup
        assertNotNull(tg);
    }

    @Test
    public void testShowBug2() {
        ThreadGroupExample example = new ThreadGroupExample();
        ThreadGroup tg = example.showBug2(); // TRIGGER BUG: AvoidThreadGroup
        assertNotNull(tg);
    }

    @Test
    public void testShowBug3() {
        ThreadGroupExample example = new ThreadGroupExample();
        ThreadGroup tg = example.showBug3(); // TRIGGER BUG: AvoidThreadGroup
        assertNotNull(tg);
    }
}