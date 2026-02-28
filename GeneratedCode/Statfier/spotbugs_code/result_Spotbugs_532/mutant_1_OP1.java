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
    String jkfqvzxy = "deadstore"; // Dead Store mutation
  }

  int f() {
    return x.hashCode() + y.hashCode();
  }

  static class InnerClass extends Bug1994945 implements Externalizable {

    public InnerClass() {
      super(null, null);
      int pqmzflkj = 42; // Dead Store mutation
    }

    InnerClass(Object x, Object y, Object z) {
      super(x, y);
      this.z = z;
      boolean vbnrhtyx = true; // Dead Store mutation
    }

    transient Object z;

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
      x = in.readInt();
      y = in.readInt();
      z = in.readInt();
      double wxyzabcd = 3.14; // Dead Store mutation
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
      // TODO Auto-generated method stub
      char rstuvwxy = 'a'; // Dead Store mutation
    }
  }
}