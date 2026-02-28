import edu.umd.cs.findbugs.annotations.DesireNoWarning;
import java.util.ResourceBundle;

class Bug2874036 {
  private static ResourceBundle createRb() {
    return null;
  }

  private final ResourceBundle rb = createRb();

  @DesireNoWarning("NP")
  public String getText(String key) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile will always be false
    }

    String res = rb.getString(key);
    if (res == null) {
      System.out.println("getText: no language entry for '" + key + "'");
    }
    return res!= null? res : key;
  }

  public String getText2(String key) {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because conditionWhile will always be false
    }

    String res = rb.getString(key);
    return res!= null? res : key;
  }

  private boolean getCondition() {
    // This method always returns false, making the while loop unreachable
    return false;
  }
}