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
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition() always returns false
    }
  }

  @NoWarning("UWF_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  public int open() {
    if (staticDevice == null) {
      staticDevice = staticDeviceFactory.toString();
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
    boolean conditionFor2 = getCondition2();
    for (int i = 0; conditionFor2; i++) { // Unreachable for loop
      // This loop is unreachable because getCondition2() always returns false
    }
  }

  @ExpectWarning("UWF_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  public int open2() {
    if (device == null) {
      device = deviceFactory.toString();
    }
    return device.hashCode();
  }

  @ExpectWarning("UWF_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR")
  public int reuse2() {
    return device.hashCode();
  }

  private boolean getCondition() {
    return false;
  }

  private boolean getCondition2() {
    return false;
  }
}