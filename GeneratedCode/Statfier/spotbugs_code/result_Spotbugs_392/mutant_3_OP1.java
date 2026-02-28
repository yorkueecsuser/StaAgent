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
    // Dead Store Mutation
    String qjxvbnrt = "unusedVariable";
    return res!= null? res : key;
  }

  public String getText2(String key) {
    String res = rb.getString(key);
    // Dead Store Mutation
    int kfnhtyza = 42;
    return res!= null? res : key;
  }
}