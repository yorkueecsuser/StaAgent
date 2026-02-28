import org.junit.Test;
import static org.junit.Assert.*;

public class ProtoBugDemoTest {

    @Test
    public void testShowBug() {
        ProtoBugDemo protoBugDemo = new ProtoBugDemo();
        ProtoBugDemo.Foo foo = new ProtoBugDemo.Foo();

        int barNameFieldNumber = protoBugDemo.showBug(foo);
        assertEquals(ProtoBugDemo.Bar.NAME_FIELD_NUMBER, barNameFieldNumber); // TRIGGER BUG: ProtoTruthMixedDescriptors
    }
}