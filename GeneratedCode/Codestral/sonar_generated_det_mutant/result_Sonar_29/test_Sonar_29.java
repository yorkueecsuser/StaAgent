import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.exceptions.misusing.InvalidUseOfMatchersException;

public class ArgumentMatchersBugTest {
    @Mock
    private ArgumentMatchersBug buggyObject;

    @Test
    public void testShowBug() {
        MockitoAnnotations.initMocks(this);
        buggyObject.showBug(buggyObject, "someString");

        // TRIGGER BUG: Mockito argument matchers should be used on all parameters
        try {
            Mockito.verify(buggyObject).someMethod(Mockito.eq("someString"), Mockito.eq("literal")); // This line will trigger the bug
            fail("Expected InvalidUseOfMatchersException to be thrown");
        } catch (InvalidUseOfMatchersException e) {
            // Expected exception, do nothing
        }
    }
}