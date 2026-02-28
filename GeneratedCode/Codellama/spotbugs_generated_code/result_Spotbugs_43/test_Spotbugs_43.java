import org.junit.Test;
import static org.junit.Assert.*;

public class DeadStoreInSwitchTest {

    @Test
    public void testDeadStoreInSwitch() {
        DeadStoreInSwitch deadStoreInSwitch = new DeadStoreInSwitch();

        int x = 5;
        int y = 0;

        switch (x) {
            case 5:
                y = 10;
            case 10:
                y = 20;
            case 20:
                throw new RuntimeException("Test exception");
        }

        assertEquals(20, y);
    }
}