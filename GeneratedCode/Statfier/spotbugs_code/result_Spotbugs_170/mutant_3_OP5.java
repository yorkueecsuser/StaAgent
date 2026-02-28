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
    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        staticDevice += "unreachable";
        break;
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
    // Introduced unreachable switch statement
    boolean condition2 = getCondition2();
    switch (condition2? 0 : 1) {
      case 0:
        // This case is unreachable because condition2 is never true
        device += "unreachable";
        break;
    }
    return device.hashCode();
  }

  @ExpectWarning("UWF_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  public int reuse2() {
    return device.hashCode();
  }

  // Method to provide dynamic condition
  private boolean getCondition() {
    return false;
  }

  // Another method to provide dynamic condition
  private boolean getCondition2() {
    return false;
  }
}