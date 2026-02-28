import org.junit.Test;
import static org.junit.Assert.*;

public class ExternalizableClassTest {
    @Test
    // TRIGGER BUG: "Externalizable" classes should have no-arguments constructors
    public void testShowBug() throws Exception {
        ExternalizableClass externalizableClass = new ExternalizableClass();
        externalizableClass.showBug();
    }
}