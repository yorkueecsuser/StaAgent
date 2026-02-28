import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

class AvoidEnumAsIdentifierTest {

    @Test
    public void testBug() {
        AvoidEnumAsIdentifier avoidEnumAsIdentifier = new AvoidEnumAsIdentifier();
        List<AvoidEnumAsIdentifier.Fruits> fruits = new ArrayList<AvoidEnumAsIdentifier.Fruits>();
        fruits.add(AvoidEnumAsIdentifier.Fruits.APPLE);
        fruits.add(AvoidEnumAsIdentifier.Fruits.ORANGE);
        fruits.add(AvoidEnumAsIdentifier.Fruits.BANANA);
        fruits.add(AvoidEnumAsIdentifier.Fruits.GRAPE);

        for (AvoidEnumAsIdentifier.Fruits fruit : fruits) {
            assertEquals("AvoidEnumAsIdentifier Test", fruit.toString(), "Fruits.APPLE");
            assertEquals("AvoidEnumAsIdentifier Test", fruit.toString(), "Fruits.ORANGE");
            assertEquals("AvoidEnumAsIdentifier Test", fruit.toString(), "Fruits.BANANA");
            assertEquals("AvoidEnumAsIdentifier Test", fruit.toString(), "Fruits.GRAPE");
        }
    }
}