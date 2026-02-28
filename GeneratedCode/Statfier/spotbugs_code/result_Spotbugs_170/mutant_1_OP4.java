import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

/**
 * Don't report UWF_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR
 * http://sourceforge.net/tracker/index.php?func=detail&amp;aid=1678229&amp;group_id=96405&amp;atid=614693
 *
 * @author pugh
 */
class Bug1678229 {

  private static String staticDevice;

  private static StringBuffer staticDeviceFactory;

  public void registerDeviceFactory(StringBuffer factory) {
    staticDeviceFactory = factory;
  }

  @NoWarning("UWF_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  public int open() {
    if (staticDevice == null) {
      staticDevice = staticDeviceFactory.toString();
    }
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      staticDevice = "unreachable";
    } else {
      // This block will always execute
      staticDevice = staticDevice + "_reachable";
    }
    return staticDevice.hashCode();
  }

  @NoWarning("UWF_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  public int reuse() {
    return staticDevice.hashCode();
  }

  private String device;

  private StringBuffer deviceFactory;

  public void registerDeviceFactory2(StringBuffer factory) {
    deviceFactory = factory;
  }

  @ExpectWarning("UWF_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  public int open2() {
    if (device == null) {
      device = deviceFactory.toString();
    }
    // Mutant: Inserting an unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because condition is always false
      device = "unreachable";
    } else {
      // This block will always execute
      device = device + "_reachable";
    }
    return device.hashCode();
  }

  @ExpectWarning("UWF_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  public int reuse2() {
    return device.hashCode();
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}