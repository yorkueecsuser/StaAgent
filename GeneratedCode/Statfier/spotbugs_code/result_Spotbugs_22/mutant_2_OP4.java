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
    // Inserting unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      x = 23; // This will never be executed
    } else {
      x = 24; // This will also never be executed
    }
  }

  private boolean getCondition() {
    return false; // This method always returns false, making the if-else block unreachable
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
}