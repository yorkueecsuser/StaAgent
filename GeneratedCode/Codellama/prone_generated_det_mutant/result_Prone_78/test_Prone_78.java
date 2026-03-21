import org.junit.Test;
import static org.junit.Assert.*;

public class InjectOnMemberAndConstructorTest {

    @Test
    public void testBug() {
        InjectOnMemberAndConstructor obj = new InjectOnMemberAndConstructor();
        obj.showBug();
        // TRIGGER BUG: InjectOnMemberAndConstructor
    }
}