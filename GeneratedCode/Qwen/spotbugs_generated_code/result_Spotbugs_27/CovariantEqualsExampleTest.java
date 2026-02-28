import org.junit.Test;
import static org.junit.Assert.*;

public class CovariantEqualsExampleTest {

    @Test
    public void testShowBug() {
        CovariantEqualsExample example = new CovariantEqualsExample(5);
        example.showBug(); // TRIGGER BUG: Eq: Covariant equals() method defined, Object.equals(Object) inherited (EQ_SELF_USE_OBJECT)  
    }
}