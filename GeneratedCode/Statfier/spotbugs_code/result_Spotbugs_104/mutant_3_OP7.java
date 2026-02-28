import java.util.ArrayList;
import javax.swing.SwingUtilities;

class Bug3031977 {

  public void m() {
    final ArrayList arr = new ArrayList();
    Runnable r =
        new Runnable() {
          @Override
          public void run() {
            // Inserting an unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
              // This loop is unreachable because getCondition() always returns false
              arr.add("unreachable");
            }
            arr.add("done");
          }
        };
    SwingUtilities.invokeLater(r);
  }

  private boolean getCondition() {
    // This method always returns false, ensuring the while loop is unreachable
    return false;
  }
}