import com.google.common.base.Strings;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2012_01_13 {

  @ExpectWarning("DMI_DOH")
  public boolean testIsNullOrEmpty() {
    boolean result = Strings.isNullOrEmpty("uid");
    boolean resultCopy = Strings.isNullOrEmpty("uid"); // Duplicate of the assignment statement
    return result;
  }

  @ExpectWarning("DMI_DOH")
  public String testEmptyToNull() {
    String result = Strings.emptyToNull("uid");
    String resultCopy = Strings.emptyToNull("uid"); // Duplicate of the assignment statement
    return result;
  }

  @ExpectWarning("DMI_DOH")
  public String testNullToEmpty() {
    String result = Strings.nullToEmpty("uid");
    String resultCopy = Strings.nullToEmpty("uid"); // Duplicate of the assignment statement
    return result;
  }
}