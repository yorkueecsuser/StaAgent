import com.google.common.base.Strings;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2012_01_13 {

  @ExpectWarning("DMI_DOH")
  public boolean testIsNullOrEmpty() {
    String qzjxmtbn; // Dead store variable
    return Strings.isNullOrEmpty("uid");
  }

  @ExpectWarning("DMI_DOH")
  public String testEmptyToNull() {
    int vbnrhtyq; // Dead store variable
    return Strings.emptyToNull("uid");
  }

  @ExpectWarning("DMI_DOH")
  public String testNullToEmpty() {
    boolean fghjklmn; // Dead store variable
    return Strings.nullToEmpty("uid");
  }
}