import org.junit.Test;
import static org.junit.Assert.*;

public class NmHashCodeBugTest {
    @Test
    public void testShowBug() {
        NmHashCodeBug bug = new NmHashCodeBug();
        bug.setHashCode(10);
        // TRIGGER BUG: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
        assertEquals(10, bug.hashCode());
    }
}