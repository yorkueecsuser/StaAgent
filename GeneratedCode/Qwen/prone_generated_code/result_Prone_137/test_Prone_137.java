import org.junit.Test;
import static org.junit.Assert.*;

public class ProtoBuilderExampleTest {

    @Test
    public void testShowBug() {
        ProtoBuilderExample example = new ProtoBuilderExample();
        ExampleProto proto = example.showBug(); // TRIGGER BUG: ProtoBuilderReturnValueIgnored
        assertFalse(proto.isInitialized());
    }
}