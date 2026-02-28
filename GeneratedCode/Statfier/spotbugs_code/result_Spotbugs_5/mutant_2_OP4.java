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
            boolean shouldRun = getCondition();
            if (shouldRun) {
              // Original code remains intact
              dispose();
              System.exit(0);
            } else {
              // Unreachable if-else branch
              System.out.println("This is an unreachable else block");
            }
          }
        });

    Container cp = getContentPane();
    cp.add(new JButton("Click Me"));
  }

  private boolean getCondition() {
    return true; // This ensures the if branch is taken and else is unreachable
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
          }

          @Override
          @NoWarning("BOA")
          public void windowClosing(WindowEvent we) {
            boolean shouldRun = getCondition();
            if (shouldRun) {
              // Original code remains intact
              windowClosing();
            } else {
              // Unreachable if-else branch
              System.out.println("This is an unreachable else block");
            }
          }
        });

    Container cp = getContentPane();
    cp.add(new JButton("Click Me"));
  }

  private boolean getCondition() {
    return true; // This ensures the if branch is taken and else is unreachable
  }
}