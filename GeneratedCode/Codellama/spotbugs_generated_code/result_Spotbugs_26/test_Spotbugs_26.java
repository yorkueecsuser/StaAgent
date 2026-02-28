import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testEquals() {
        MyEnum myEnum = MyEnum.VALUE1;
        MyEnum otherEnum = MyEnum.VALUE2;

        // TRIGGER BUG: Eq: Covariant equals() method defined for enum (EQ_DONT_DEFINE_EQUALS_FOR_ENUM)
        assertFalse(myEnum.equals(otherEnum));
    }

    @Test
    public void showBug() {
        MyEnum myEnum = MyEnum.VALUE1;
        MyEnum otherEnum = MyEnum.VALUE2;

        // TRIGGER BUG: Eq: Covariant equals() method defined for enum (EQ_DONT_DEFINE_EQUALS_FOR_ENUM)
        assertFalse(myEnum.equals(otherEnum));
    }
}