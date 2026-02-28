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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if shouldRun is true
    } else {
      // Unreachable code due to shouldRun always being false
      System.out.println("This is an unreachable else block in f()");
    }
    return x.hashCode() + y.hashCode();
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if shouldRun is true
      } else {
        // Unreachable code due to shouldRun always being false
        System.out.println("This is an unreachable else block in readExternal()");
      }
      x = in.readInt();
      y = in.readInt();
      z = in.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if shouldRun is true
      } else {
        // Unreachable code due to shouldRun always being false
        System.out.println("This is an unreachable else block in writeExternal()");
      }
      // TODO Auto-generated method stub

    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the else branches unreachable
  }
}