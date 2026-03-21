import org.junit.Test;
import static org.junit.Assert.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class BuggyFrameTest {

    @Test
    public void testActionPerformedNotCalled() {
        BuggyFrame buggyFrame = new BuggyFrame();
        buggyFrame.showBug();

        // TRIGGER BUG: BOA: Class overrides a method implemented in super class Adapter wrongly (BOA_BADLY_OVERRIDDEN_ADAPTER)
        // Simulate button click event to trigger the bug
        simulateButtonClick(buggyFrame.getButton());

        // Check if the expected message is present in the system output
        assertFalse(System.out.toString().contains("Button clicked - THIS WILL NOT GET CALLED"));
    }

    // Simulate button click event
    private void simulateButtonClick(JButton button) {
        for (ActionListener listener : button.getActionListeners()) {
            listener.actionPerformed(new ActionEvent(button, ActionEvent.ACTION_PERFORMED, ""));
        }
    }
}