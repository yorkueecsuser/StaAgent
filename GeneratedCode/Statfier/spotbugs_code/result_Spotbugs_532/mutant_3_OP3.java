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
  }

  int f() {
    boolean condition = getCondition();
    if (condition) {
      // This is an unreachable if statement because getCondition() always returns false
    }
    return x.hashCode() + y.hashCode();
  }

  private boolean getCondition() {
    return false;
  }

  static class InnerClass extends Bug1994945 implements Externalizable {

    public InnerClass() {
      super(null, null);
    }

    InnerClass(Object x, Object y, Object z) {
      super(x, y);
      this.z = z;
    }

    transient Object z;

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
      boolean condition = getReadCondition();
      if (condition) {
        // This is an unreachable if statement because getReadCondition() always returns false
      }
      x = in.readInt();
      y = in.readInt();
      z = in.readInt();
    }

    private boolean getReadCondition() {
      return false;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
      boolean condition = getWriteCondition();
      if (condition) {
        // This is an unreachable if statement because getWriteCondition() always returns false
      }
      // TODO Auto-generated method stub
    }

    private boolean getWriteCondition() {
      return false;
    }
  }
}