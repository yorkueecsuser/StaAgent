import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;
import edu.umd.cs.findbugs.annotations.SuppressWarnings;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

class BadlyOverriddenAdapterTest extends JFrame {
  public BadlyOverriddenAdapterTest() {
    addWindowListener(
        new WindowAdapter() {
          @SuppressWarnings("DM_EXIT")
          @ExpectWarning("BOA")
          public void windowClosing() {
            dispose();
            System.exit(0);
            // Introduced unreachable for loop
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
              // Unreachable code
            }
          }
        });

    Container cp = getContentPane();
    cp.add(new JButton("Click Me"));
  }

  private boolean getCondition() {
    return false;
  }
}

class GoodlyOverridenAdapterTest extends JFrame {
  public GoodlyOverridenAdapterTest() {
    addWindowListener(
        new WindowAdapter() {
          @NoWarning("BOA")
          public void windowClosing() {
            dispose();
            System.exit(0);
            // Introduced unreachable for loop
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
              // Unreachable code
            }
          }

          @Override
          @NoWarning("BOA")
          public void windowClosing(WindowEvent we) {
            windowClosing();
          }
        });

    Container cp = getContentPane();
    cp.add(new JButton("Click Me"));
  }

  private boolean getCondition() {
    return false;
  }
}