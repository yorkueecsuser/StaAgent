import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class ImpossibleDowncastTest {
    @Test
    public void testBug() {
        ImpossibleDowncast impossibleDowncast = new ImpossibleDowncast();
        impossibleDowncast.showBug();
        
        // TRIGGER BUG: BC: Impossible downcast (BC_IMPOSSIBLE_DOWNCAST)
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        String[] array = (String[]) list.toArray(); // This cast will always throw a ClassCastException.
        System.out.println(array[0] + " " + array[1]);
    }
}