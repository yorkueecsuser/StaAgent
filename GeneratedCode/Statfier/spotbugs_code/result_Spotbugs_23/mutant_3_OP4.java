import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class ExternalizableTest2 implements Externalizable {
  ExternalizableTest2() {}

  @Override
  public void readExternal(ObjectInput in) {}

  @Override
  public void writeExternal(ObjectOutput out) {}

  static class ExternalizableTest2a extends ExternalizableTest2 {
    int x;

    ExternalizableTest2a(int i) {
      x = i;
    }

    @Override
    public void readExternal(ObjectInput in) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        x = 42;
      } else {
        // Unreachable else block
        x = 99;
      }
    }

    private boolean getCondition() {
      return false; // This ensures the else block is unreachable but not due to a compile-time constant
    }

    @Override
    public void writeExternal(ObjectOutput out) {}
  }

  public static void main(String args[]) throws Exception {
    ByteArrayOutputStream pout = new ByteArrayOutputStream();
    ObjectOutputStream oout = new ObjectOutputStream(pout);
    oout.writeObject(new ExternalizableTest2a(42));
    oout.close();
    byte b[] = pout.toByteArray();
    ByteArrayInputStream pin = new ByteArrayInputStream(b);
    ObjectInputStream oin = new ObjectInputStream(pin);
    Object o = oin.readObject();
    System.out.println("read object");
    System.out.println(o);
  }
}