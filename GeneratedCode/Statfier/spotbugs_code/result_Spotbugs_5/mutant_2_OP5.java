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
          }
        });

    Container cp = getContentPane();
    cp.add(new JButton("Click Me"));

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is unreachable");
        break;
      case 1:
        // This is the only reachable case
        break;
    }
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
          }

          @Override
          @NoWarning("BOA")
          public void windowClosing(WindowEvent we) {
            windowClosing();
          }
        });

    Container cp = getContentPane();
    cp.add(new JButton("Click Me"));

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is always false
        System.out.println("This is unreachable");
        break;
      case 1:
        // This is the only reachable case
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}