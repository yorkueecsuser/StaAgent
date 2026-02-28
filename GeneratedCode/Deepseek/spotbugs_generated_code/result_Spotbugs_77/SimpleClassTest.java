import org.junit.Test;
import static org.junit.Assert.*;

public class UnrelatedClassAndInterfaceComparisonTest {

    @Test
    public void testShowBug() {
        UnrelatedClassAndInterfaceComparison obj = new UnrelatedClassAndInterfaceComparison();
        SimpleClass simpleClass = new SimpleClass();
        SimpleInterface simpleInterface = () -> System.out.println("Implementation of simple interface");

        boolean result = obj.showBug(simpleClass, simpleInterface); // TRIGGER BUG: EC: Call to equals() comparing unrelated class and interface (EC_UNRELATED_CLASS_AND_INTERFACE)

        assertFalse("Comparison should be false", result);
    }
}