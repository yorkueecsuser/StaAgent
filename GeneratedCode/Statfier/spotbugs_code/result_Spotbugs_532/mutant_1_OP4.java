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
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code that should run if condition is true
    } else {
      // Unreachable code due to false condition
      System.out.println("This is an unreachable else block in the constructor.");
    }
  }

  int f() {
    return x.hashCode() + y.hashCode();
  }

  static class InnerClass extends Bug1994945 implements Externalizable {

    public InnerClass() {
      super(null, null);
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if condition is true
      } else {
        // Unreachable code due to false condition
        System.out.println("This is an unreachable else block in the default constructor.");
      }
    }

    InnerClass(Object x, Object y, Object z) {
      super(x, y);
      this.z = z;
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if condition is true
      } else {
        // Unreachable code due to false condition
        System.out.println("This is an unreachable else block in the parameterized constructor.");
      }
    }

    transient Object z;

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
      x = in.readInt();
      y = in.readInt();
      z = in.readInt();
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if condition is true
      } else {
        // Unreachable code due to false condition
        System.out.println("This is an unreachable else block in readExternal.");
      }
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
      // TODO Auto-generated method stub
      boolean shouldRun = getCondition();
      if (shouldRun) {
        // Some code that should run if condition is true
      } else {
        // Unreachable code due to false condition
        System.out.println("This is an unreachable else block in writeExternal.");
      }
    }
  }

  private static boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}