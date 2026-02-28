import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

class TypeParameterQualifierTest {
    @Test
    public void testBug() {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        // BUG: TypeParameterQualifier
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}