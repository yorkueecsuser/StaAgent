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
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      staticDeviceFactory.append("unreachable");
    }
    if (staticDevice == null) {
      staticDevice = staticDeviceFactory.toString();
    }
    return staticDevice.hashCode();
  }

  @NoWarning("UWF_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  public int reuse() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      staticDevice = "unreachable";
    }
    return staticDevice.hashCode();
  }

  private String device;

  private StringBuffer deviceFactory;

  public void registerDeviceFactory2(StringBuffer factory) {
    deviceFactory = factory;
  }

  @ExpectWarning("UWF_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  public int open2() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      deviceFactory.append("unreachable");
    }
    if (device == null) {
      device = deviceFactory.toString();
    }
    return device.hashCode();
  }

  @ExpectWarning("UWF_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  public int reuse2() {
    boolean condition = getCondition();
    if (condition) {
      // Unreachable code
      device = "unreachable";
    }
    return device.hashCode();
  }

  private boolean getCondition() {
    return false; // This method will always return false, but it's not a compile-time constant
  }
}