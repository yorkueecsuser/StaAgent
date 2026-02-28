import org.junit.Test;
import static org.junit.Assert.*;

public class ProtoBuilderExampleTest {

    @Test
    public void testShowBug() {
        ProtoBuilderExample example = new ProtoBuilderExample();
        example.showBug(); // TRIGGER BUG: ProtoBuilderReturnValueIgnored
    }
}