import com.google.common.base.Strings;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2012_01_13 {

  @ExpectWarning("DMI_DOH")
  public boolean testIsNullOrEmpty() {
    String unusedVariable1 = "abcdefgh";
    return Strings.isNullOrEmpty("uid");
  }

  @ExpectWarning("DMI_DOH")
  public String testEmptyToNull() {
    int unusedVariable2 = 12345678;
    return Strings.emptyToNull("uid");
  }

  @ExpectWarning("DMI_DOH")
  public String testNullToEmpty() {
    boolean unusedVariable3 = true;
    return Strings.nullToEmpty("uid");
  }
}