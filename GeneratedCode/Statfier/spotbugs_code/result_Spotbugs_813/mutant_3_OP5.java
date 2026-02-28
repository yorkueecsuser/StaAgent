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

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case will never be executed because condition is always false
        System.out.println("This is unreachable");
        break;
      case 1:
        // This case will always be executed
        System.out.println("This is reachable");
        break;
    }
  }

  private boolean getCondition() {
    return false;
  }
}