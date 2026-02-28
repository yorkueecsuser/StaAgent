import org.junit.Test;
import static org.junit.Assert.*;

class EnumIdentifierBug {

    class Foo {
        String enumVar = "foo"; // BUG: AvoidEnumAsIdentifier
    }

    public String showBug() {
        Foo foo = new Foo();
        return foo.enumVar; // TRIGGER BUG: AvoidEnumAsIdentifier
    }

    public static void main(String[] args) {
        EnumIdentifierBug bugDemo = new EnumIdentifierBug();
        System.out.println(bugDemo.showBug());
    }
}

public class EnumIdentifierBugTest {

    @Test
    public void testShowBug() {
        EnumIdentifierBug bugDemo = new EnumIdentifierBug();
        assertEquals("foo", bugDemo.showBug()); // TRIGGER BUG: AvoidEnumAsIdentifier
    }
}