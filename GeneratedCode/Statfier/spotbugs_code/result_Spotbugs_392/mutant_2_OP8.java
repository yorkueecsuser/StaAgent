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
    return res!= null? res : key;
  }

  public String getText2(String key) {
    String res = rb.getString(key);
    return res!= null? res : key;
  }

  // Mutated code
  @DesireNoWarning("NP")
  public String getText3(String x) {
    String q = rb.getString(x);
    if (q == null) {
      System.out.println("getText3: no language entry for '" + x + "'");
    }
    return q!= null? q : x;
  }

  public String getText4(String y) {
    String p = rb.getString(y);
    return p!= null? p : y;
  }
}