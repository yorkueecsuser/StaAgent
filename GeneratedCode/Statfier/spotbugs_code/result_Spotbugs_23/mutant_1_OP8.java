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

    // Mutant code
    int y = 42; // Renamed 'x' to 'y'
    ExternalizableTest2a test = new ExternalizableTest2a(y);
    ByteArrayOutputStream qout = new ByteArrayOutputStream();
    ObjectOutputStream oout2 = new ObjectOutputStream(qout);
    oout2.writeObject(test);
    oout2.close();
    byte c[] = qout.toByteArray();
    ByteArrayInputStream qin = new ByteArrayInputStream(c);
    ObjectInputStream oin2 = new ObjectInputStream(qin);
    Object p = oin2.readObject();
    System.out.println("mutated read object");
    System.out.println(p);
  }
}