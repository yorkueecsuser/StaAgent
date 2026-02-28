import com.google.common.base.Strings;
import edu.umd.cs.findbugs.annotations.ExpectWarning;

class Ideas_2012_01_13 {

  @ExpectWarning("DMI_DOH")
  public boolean testIsNullOrEmpty() {
    return Strings.isNullOrEmpty("uid");
  }

  @ExpectWarning("DMI_DOH")
  public String testEmptyToNull() {
    return Strings.emptyToNull("uid");
  }

  @ExpectWarning("DMI_DOH")
  public String testNullToEmpty() {
    return Strings.nullToEmpty("uid");
  }

  // Mutated code
  @ExpectWarning("DMI_DOH")
  public boolean testIsNullOrEmptyMutant() {
    String x = "uid";
    return Strings.isNullOrEmpty(x);
  }

  @ExpectWarning("DMI_DOH")
  public String testEmptyToNullMutant() {
    String y = "uid";
    return Strings.emptyToNull(y);
  }

  @ExpectWarning("DMI_DOH")
  public String testNullToEmptyMutant() {
    String z = "uid";
    return Strings.nullToEmpty(z);
  }
}