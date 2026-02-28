import org.junit.Test;
import static org.junit.Assert.*;

public class TypeParameterQualifierBugTest {

    @Test
    public void testPopulateWithIncorrectTypeParameterQualifier() {
        TypeParameterQualifierBug bugDemo = new TypeParameterQualifierBug();
        Message message = bugDemo.showBug("Hello, World!"); // TRIGGER BUG: TypeParameterQualifier
        assertEquals("Message{content='Hello, World!'}", message.toString());
    }
}