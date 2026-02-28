import org.junit.Test;
import static org.junit.Assert.*;

public class DataRaceExampleTest {

    @Test
    public void testShowBug() {
        DataRaceExample dataRaceExample = new DataRaceExample();
        dataRaceExample.showBug(); // TRIGGER BUG: THREAD_SAFETY_VIOLATION
        assertEquals(0, dataRaceExample.getCounter()); // This assertion may fail due to the data race
    }
}