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

    // Introduced unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement.");
    }
  }

  private boolean getCondition() {
    return false;
  }
}