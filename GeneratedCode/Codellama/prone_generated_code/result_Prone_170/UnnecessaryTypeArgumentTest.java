import org.junit.Test;
import static org.junit.Assert.*;

class UnnecessaryTypeArgumentTest {
    @Test
    public void testBug() {
        UnnecessaryTypeArgument obj = new UnnecessaryTypeArgument();
        obj.showBug();
        assertEquals(4, obj.list.size());
    }
}