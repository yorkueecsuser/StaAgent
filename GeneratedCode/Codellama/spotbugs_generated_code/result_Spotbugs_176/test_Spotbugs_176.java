import org.junit.Test;
import static org.junit.Assert.*;

class BuggyClassTest {
    @Test
    public void testBugTrigger() {
        BuggyClass buggyClass = new BuggyClass();
        buggyClass.addToList("Hello");
        buggyClass.addToList("World");
        ArrayList<String> list = buggyClass.getList();
        list.add("New Element");
        assertEquals(list.size(), 3);
    }
}