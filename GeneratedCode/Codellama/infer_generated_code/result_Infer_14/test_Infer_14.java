import org.junit.Test;
import static org.junit.Assert.*;

class StarvationActivityTest {
    private StarvationActivity starvationActivity;

    @Test
    public void testShowBug() {
        starvationActivity = new StarvationActivity();
        // TRIGGER BUG: STARVATION
        starvationActivity.showBug();
    }
}