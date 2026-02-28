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

            // Introduced an unreachable switch statement
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
              case 0:
                // This case is unreachable because condition is never true
                System.out.println("This will never be printed");
                break;
              case 1:
                // This case is always executed
                System.out.println("This will always be printed");
                break;
            }
          }
        };
    SwingUtilities.invokeLater(r);
  }

  private boolean getCondition() {
    return false;
  }
}