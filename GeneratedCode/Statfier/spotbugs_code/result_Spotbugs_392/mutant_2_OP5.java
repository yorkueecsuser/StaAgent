import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import java.util.ResourceBundle;

class Bug2874036 {
  private static ResourceBundle createRb() {
    return null;
  }

  private final ResourceBundle rb = createRb();

  @DesireNoWarning("NP")
  public String getText(String key) {
    String res = rb.getString(key);
    if (res == null) {
      System.out.println("getText: no language entry for '" + key + "'");
    }
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
    }
    return res!= null? res : key;
  }

  public String getText2(String key) {
    String res = rb.getString(key);
    return res!= null? res : key;
  }

  // Helper method to provide a dynamic condition
  private boolean getCondition() {
    return false;
  }
}