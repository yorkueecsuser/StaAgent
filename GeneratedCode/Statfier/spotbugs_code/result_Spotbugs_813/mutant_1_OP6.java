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

    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because getCondition() returns false
    }
  }

  private boolean getCondition() {
    return false;
  }
}