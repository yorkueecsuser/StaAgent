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
            
            // Introduced unreachable for loop according to mutation operator
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // This loop is unreachable because conditionFor will always be false
            }
          }
          
          private boolean getCondition() {
              return false; // This method ensures the condition is dynamically determined but always returns false
          }
        };
    SwingUtilities.invokeLater(r);
  }
}