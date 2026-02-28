import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

class Bug1994945 implements Serializable {

  private static final long serialVersionUID = 1L;

  transient Object x;

  Object y;

  Bug1994945(Object x, Object y) {
    this.x = x;
    this.y = y;
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
    }
  }

  int f() {
    return x.hashCode() + y.hashCode();
  }

  static class InnerClass extends Bug1994945 implements Externalizable {

    public InnerClass() {
      super(null, null);
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }

    InnerClass(Object x, Object y, Object z) {
      super(x, y);
      this.z = z;
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }

    transient Object z;

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
      x = in.readInt();
      y = in.readInt();
      z = in.readInt();
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
      // TODO Auto-generated method stub
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable code
      }
    }

    private boolean getCondition() {
      return false; // This method always returns false, ensuring the loop is unreachable
    }
  }
}