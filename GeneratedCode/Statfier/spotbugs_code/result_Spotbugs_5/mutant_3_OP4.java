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
            // Mutant addition
            boolean condition = getCondition();
            if (condition) {
              // This block will never be executed because condition is always false
              System.out.println("This is an unreachable if block");
            } else {
              // This block will also never be executed because condition is always false
              System.out.println("This is an unreachable else block");
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
            // Mutant addition
            boolean condition = getCondition();
            if (condition) {
              // This block will never be executed because condition is always false
              System.out.println("This is an unreachable if block");
            } else {
              // This block will also never be executed because condition is always false
              System.out.println("This is an unreachable else block");
            }
          }

          @Override
          @NoWarning("BOA")
          public void windowClosing(WindowEvent we) {
            windowClosing();
            // Mutant addition
            boolean condition = getCondition();
            if (condition) {
              // This block will never be executed because condition is always false
              System.out.println("This is an unreachable if block");
            } else {
              // This block will also never be executed because condition is always false
              System.out.println("This is an unreachable else block");
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