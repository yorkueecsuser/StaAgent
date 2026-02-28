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
            dispose(); // Mutant: Duplicate of dispose();
            System.exit(0);
          }
        });

    Container cp = getContentPane();
    cp.add(new JButton("Click Me"));
    cp.add(new JButton("Click Me")); // Mutant: Duplicate of adding JButton
  }
}

class GoodlyOverridenAdapterTest extends JFrame {
  public GoodlyOverridenAdapterTest() {
    addWindowListener(
        new WindowAdapter() {
          @NoWarning("BOA")
          public void windowClosing() {
            dispose();
            dispose(); // Mutant: Duplicate of dispose();
            System.exit(0);
          }

          @Override
          @NoWarning("BOA")
          public void windowClosing(WindowEvent we) {
            windowClosing();
            windowClosing(); // Mutant: Duplicate of windowClosing();
          }
        });

    Container cp = getContentPane();
    cp.add(new JButton("Click Me"));
    cp.add(new JButton("Click Me")); // Mutant: Duplicate of adding JButton
  }
}