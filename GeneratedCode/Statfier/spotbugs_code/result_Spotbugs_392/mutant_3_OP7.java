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
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      System.out.println("This is an unreachable loop");
    }
    return res!= null? res : key;
  }

  public String getText2(String key) {
    String res = rb.getString(key);
    // Inserting unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable
      System.out.println("This is another unreachable loop");
    }
    return res!= null? res : key;
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is always false, making the loop unreachable
  }
}