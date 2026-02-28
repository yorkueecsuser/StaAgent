import java.util.ArrayList;
import javax.swing.SwingUtilities;

class Bug3031977 {

  public void m() {
    final ArrayList arr = new ArrayList();
    Runnable r =
        new Runnable() {
          @Override
          public void run() {
            arr.add("done");
            // Inserting unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
              // This block will never execute because shouldRun is always false
              arr.add("unreachable");
            } else {
              // This block will always execute
              arr.add("reachable");
            }
          }
        };
    SwingUtilities.invokeLater(r);
  }

  private boolean getCondition() {
    // Always return false to make the if-block unreachable
    return false;
  }
}