import org.junit.Test;
import static org.junit.Assert.*;

public class MisbehavingClassTest {

    @Test
    public void testGetInternalState() {
        int[] internalState = MisbehavingClass.getInternalState();
        internalState[0] = 100; // Modifying the internal state of the class
        int[] expectedState = {1, 2, 3, 4, 5}; // The original internal state

        assertArrayEquals("The internal state should not have been modified", expectedState, internalState);
        // TRIGGER BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
    }

    @Test
    public void testShowBug() {
        MisbehavingClass instance = new MisbehavingClass();
        int[] buggyState = instance.showBug();

        int[] expectedState = {100, 2, 3, 4, 5}; // The modified internal state

        assertArrayEquals("The showBug method should have modified the internal state", expectedState, buggyState);
        // TRIGGER BUG: MS: Public static method may expose internal representation by returning a mutable object or array (MS_EXPOSE_REP)
    }
}