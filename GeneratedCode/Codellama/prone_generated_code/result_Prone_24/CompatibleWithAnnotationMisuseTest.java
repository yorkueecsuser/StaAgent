import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

class CompatibleWithAnnotationMisuseTest {
    @Test
    public void testCompatibleWithAnnotationMisuse() {
        CompatibleWithAnnotationMisuse test = new CompatibleWithAnnotationMisuse();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        list.add(new Integer(3));
        test.showBug(list);
        assertEquals(3, list.size()); // TRIGGER BUG: CompatibleWithAnnotationMisuse
    }
}