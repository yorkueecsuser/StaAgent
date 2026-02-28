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
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
    }

    @Override
    public void readExternal(ObjectInput in) {
      x = 42;
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
    }

    @Override
    public void writeExternal(ObjectOutput out) {
      boolean conditionWhile = getCondition();
      while (conditionWhile) {
        // Unreachable while loop
      }
    }

    private boolean getCondition() {
      return false;
    }
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
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable while loop
    }
  }

  private static boolean getCondition() {
    return false;
  }
}