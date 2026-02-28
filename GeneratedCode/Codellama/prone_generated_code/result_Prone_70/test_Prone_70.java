import org.junit.Test;
import static org.junit.Assert.*;

public class ImpossibleNullComparisonTest {
    @Test
    public void testBugTrigger() {
        MyProto proto = new MyProto();
        proto.setField("Hello, World!");
        proto.setRepeatedField(0, "Repeated Field 1");
        proto.setRepeatedField(1, "Repeated Field 2");

        // TRIGGER BUG: ImpossibleNullComparison
        if (proto.getField() == null) {
            System.out.println("Field should not be null");
        }

        // TRIGGER BUG: ImpossibleNullComparison
        if (proto.getRepeatedFieldList()!= null) {
            System.out.println("Repeated field list should not be null");
        }

        // TRIGGER BUG: ImpossibleNullComparison
        if (proto.getRepeatedField(1)!= null) {
            System.out.println("Repeated field at index 1 should not be null");
        }
    }
}