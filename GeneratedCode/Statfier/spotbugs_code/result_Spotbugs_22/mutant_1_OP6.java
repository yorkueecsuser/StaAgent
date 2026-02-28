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
    // Inserting an unreachable for loop
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor is always false
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

    // Inserting an unreachable for loop
    boolean conditionForMain = getCondition();
    for (int i = 0; conditionForMain; i++) {
      // This loop is unreachable because conditionForMain is always false
    }
  }

  private static boolean getCondition() {
    return false;
  }
}