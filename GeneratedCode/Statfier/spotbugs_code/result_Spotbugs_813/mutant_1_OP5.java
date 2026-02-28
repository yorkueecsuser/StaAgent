import edu.umd.cs.findbugs.annotations.DesireWarning;
import edu.umd.cs.findbugs.annotations.ExpectWarning;
import java.io.Serializable;

class BadStoreOfNonSerializableObject implements Serializable {

  private static final long serialVersionUID = 0;

  Object x;

  @ExpectWarning("Se")
  NotSerializable y;

  static final class NotSerializable {}

  @DesireWarning("Se")
  BadStoreOfNonSerializableObject() {
    x = new NotSerializable();
    y = new NotSerializable();

    // Introduced an unreachable switch statement
    boolean alwaysFalse = getCondition();
    switch (alwaysFalse? 1 : 0) {
      case 1:
        // This case is unreachable because alwaysFalse is always false
        System.out.println("This will never be printed");
        break;
      default:
        // Default case is also unreachable due to the same reason
        System.out.println("This will also never be printed");
        break;
    }
  }

  // Method to simulate a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}