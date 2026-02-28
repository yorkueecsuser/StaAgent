import org.junit.Test;
import static org.junit.Assert.*;

public class ClassCastExceptionExampleTest {

    @Test
    public void testShowBugTriggersClassCastException() {
        ClassCastExceptionExample example = new ClassCastExceptionExample();
        Integer[] array = example.showBug(); // TRIGGER BUG: ClassCastExceptionWithToArray
    }
}