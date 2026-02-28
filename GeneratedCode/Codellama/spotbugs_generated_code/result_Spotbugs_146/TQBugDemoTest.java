import org.junit.Test;
import static org.junit.Assert.*;

public class TQBugDemoTest {
    @Test
    public void testBugTrigger() {
        // TRIGGER BUG: TQ: Value that might carry a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        String[] arr = new String[2];
        arr[0] = list.get(0);
        arr[1] = list.get(1);
        System.out.println(arr[0] + " " + arr[1]);
    }
}