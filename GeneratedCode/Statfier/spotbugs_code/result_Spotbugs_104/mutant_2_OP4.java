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
              // This block is reachable
              arr.add("reachable");
            } else {
              // This block is unreachable because shouldRun is always false
              arr.add("unreachable");
            }
          }
        };
    SwingUtilities.invokeLater(r);
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}