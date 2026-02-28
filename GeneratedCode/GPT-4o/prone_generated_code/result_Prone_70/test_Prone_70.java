import org.junit.Test;
import static org.junit.Assert.*;

public class ProtoComparisonExampleTest {

    @Test
    public void testShowBug() {
        ProtoComparisonExample example = new ProtoComparisonExample();
        ProtoComparisonExample.MyProto proto = new ProtoComparisonExample.MyProto();

        // Directly invoke the method with the bug
        example.showBug(proto); // TRIGGER BUG: ImpossibleNullComparison
    }
}