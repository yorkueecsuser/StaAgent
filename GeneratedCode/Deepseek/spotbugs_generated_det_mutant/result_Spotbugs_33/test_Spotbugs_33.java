import org.junit.Test;
import static org.junit.Assert.*;

public class ABugTriggerTest {
    @Test(expected = NullPointerException.class)
    public void testBugTrigger() {
        B b = new B(null); // Trigger bug
        b.showBug();
    }

    abstract class A {
        int hashCode;
        abstract Object getValue();

        A() {
            hashCode = getValue().hashCode();
        }
    }

    class B extends A {
        Object value;

        B(Object v) {
            this.value = v;
        }

        @Override
        Object getValue() {
            return value;
        }

        public void showBug() {
            System.out.println(hashCode);
        }
    }
}