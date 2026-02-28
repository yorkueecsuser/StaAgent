import org.junit.Test;
import static org.junit.Assert.*;

public class ApplicationServerSimulationTest {

    @Test
    public void testShowBug() {
        ApplicationServerSimulation appSim = new ApplicationServerSimulation();
        appSim.showBug(0); // TRIGGER BUG: DoNotTerminateVM
    }

    @Test
    public void testShowBugWithDifferentExitCode() {
        ApplicationServerSimulation appSim = new ApplicationServerSimulation();
        appSim.showBug(1); // TRIGGER BUG: DoNotTerminateVM
    }
}