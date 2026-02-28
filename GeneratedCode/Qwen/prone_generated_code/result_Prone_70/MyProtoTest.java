import org.junit.Test;
import static org.junit.Assert.*;

public class ProtoBugExampleTest {

    @Test
    public void testImpossibleNullComparison() {
        MyProto proto = new MyProto();
        ProtoBugExample example = new ProtoBugExample();

        // TRIGGER BUG: ImpossibleNullComparison
        assertEquals("Field is null", example.showBug(proto)); // Trigger line: 16

        // TRIGGER BUG: ImpossibleNullComparison
        assertEquals("Repeated field at index 1 is not null", example.showBug(proto)); // Trigger line: 19
    }
}