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
      x = in.readInt();
      y = in.readInt();
      z = in.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
      // TODO Auto-generated method stub

    }
  }

  // Mutated code
  transient Object a;

  Object b;

  Bug1994945(Object a, Object b) {
    this.a = a;
    this.b = b;
  }

  int g() {
    return a.hashCode() + b.hashCode();
  }

  static class InnerClassMutant extends Bug1994945 implements Externalizable {

    public InnerClassMutant() {
      super(null, null);
    }

    InnerClassMutant(Object a, Object b, Object c) {
      super(a, b);
      this.c = c;
    }

    transient Object c;

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
      a = in.readInt();
      b = in.readInt();
      c = in.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
      // TODO Auto-generated method stub

    }
  }
}