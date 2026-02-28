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
            
            // Introduced unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
              // This loop will never execute because conditionWhile is always false
            }
          }
        };
    SwingUtilities.invokeLater(r);
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but always returns false
  }
}