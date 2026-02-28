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
      x = 42;
      // Mutant code: Adding an unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        x = 99; // This line is unreachable
      }
    }

    @Override
    public void writeExternal(ObjectOutput out) {}
    
    // Method to provide a dynamic condition
    private boolean getCondition() {
      return false; // This will always return false, making the if block unreachable
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
  }
}