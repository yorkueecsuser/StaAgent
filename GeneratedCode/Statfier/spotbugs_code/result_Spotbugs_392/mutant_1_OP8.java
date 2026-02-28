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
  private final ResourceBundle x = createRb();

  @DesireNoWarning("NP")
  public String getTxt(String k) {
    String z = x.getString(k);
    if (z == null) {
      System.out.println("getTxt: no language entry for '" + k + "'");
    }
    return z!= null? z : k;
  }

  public String getTxt2(String k) {
    String z = x.getString(k);
    return z!= null? z : k;
  }
}