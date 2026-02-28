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
    String abcdefgh = "abcdefgh"; // Dead store
  }

  int f() {
    return x.hashCode() + y.hashCode();
  }

  static class InnerClass extends Bug1994945 implements Externalizable {

    public InnerClass() {
      super(null, null);
      int hijklmno = 12345678; // Dead store
    }

    InnerClass(Object x, Object y, Object z) {
      super(x, y);
      this.z = z;
      double pqrsytuv = 3.14159265; // Dead store
    }

    transient Object z;

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
      x = in.readInt();
      y = in.readInt();
      z = in.readInt();
      boolean wxyzabcd = true; // Dead store
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
      // TODO Auto-generated method stub
      char vwxyztuv = 'a'; // Dead store
    }
  }
}