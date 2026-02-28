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
    // Dead Store Mutation
    String abcdefgh = "abcdefgh";
  }

  @Override
  public void readExternal(ObjectInput in) {
    x = 17;
    // Dead Store Mutation
    int hijklmno = 12345;
  }

  @Override
  public void writeExternal(ObjectOutput out) {
    // Dead Store Mutation
    boolean opqrstuv = true;
  }

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
    // Dead Store Mutation
    double vwxyzabc = 3.14;
  }
}