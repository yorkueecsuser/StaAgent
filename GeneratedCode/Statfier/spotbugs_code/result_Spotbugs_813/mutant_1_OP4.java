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

    // Introduced unreachable if-else statement
    boolean condition = getCondition();
    if (condition) {
      // This block will never execute because getCondition() always returns false
      System.out.println("This is an unreachable block.");
    } else {
      // Alternative block that will always execute
      System.out.println("This block will always execute.");
    }
  }

  private boolean getCondition() {
    // Always return false to ensure the if block is unreachable
    return false;
  }
}