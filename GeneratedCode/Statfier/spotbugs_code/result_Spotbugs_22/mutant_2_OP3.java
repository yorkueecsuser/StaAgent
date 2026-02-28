import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class ExternalizableTest implements Externalizable {
  int x;

  ExternalizableTest(int i) {
    x = i;
  }

  @Override
  public void readExternal(ObjectInput in) {
    x = 17;
    // Mutant code: Inserting an unreachable if branch
    boolean condition = getCondition();
    if (condition) {
      x = 42; // This line is unreachable because getCondition() always returns false
    }
  }

  @Override
  public void writeExternal(ObjectOutput out) {}

  public static void main(String args[]) throws Exception {
    ByteArrayOutputStream pout = new ByteArrayOutputStream();
    ObjectOutputStream oout = new ObjectOutputStream(pout);
    oout.writeObject(new ExternalizableTest(42));
    oout.close();
    byte b[] = pout.toByteArray();
    ByteArrayInputStream pin = new ByteArrayInputStream(b);
    ObjectInputStream oin = new ObjectInputStream(pin);
    Object o = oin.readObject();
    System.out.println("read object");
    System.out.println(o);
  }

  // Method to provide a dynamic condition that is always false
  private boolean getCondition() {
    return false;
  }
}