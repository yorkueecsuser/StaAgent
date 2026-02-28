import org.junit.Test;
import java.util.ArrayList;

public class IncomparableBugTest {

    @Test(expected = ClassCastException.class)
    public void testShowBugTriggersIncomparableException() {
        IncomparableBug bugDemo = new IncomparableBug();
        ArrayList<IncomparableBug.Person> people = new ArrayList<>();
        people.add(new IncomparableBug.Person("Alice", 30));
        people.add(new IncomparableBug.Person("Bob", 25));
        bugDemo.showBug(people); // TRIGGER BUG: Incomparable
    }
}