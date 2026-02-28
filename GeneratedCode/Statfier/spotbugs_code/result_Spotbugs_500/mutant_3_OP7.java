import java.awt.event.ActionEvent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.AbstractAction;
import javax.swing.JMenuItem;

class Serializable2 {
  int x;

  Serializable2(int i) {
    x = i;
  }

  static class Inner extends Serializable2 implements Serializable {
    Inner() {
      super(42);
    }
  }

  public void exampleOfSerializableAnonymousClass() {
    JMenuItem mi =
        new JMenuItem(
            new AbstractAction() {
              @Override
              public void actionPerformed(ActionEvent ae) {}
            });

    // Introduced unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // This loop is unreachable because getCondition() always returns false
    }
  }

  private boolean getCondition() {
    return false;
  }

  public static void main(String args[]) throws Exception {
    ByteArrayOutputStream pout = new ByteArrayOutputStream();
    ObjectOutputStream oout = new ObjectOutputStream(pout);
    oout.writeObject(new Inner());
    oout.close();
    byte b[] = pout.toByteArray();
    ByteArrayInputStream pin = new ByteArrayInputStream(b);
    ObjectInputStream oin = new ObjectInputStream(pin);
    Object o = oin.readObject();
    System.out.println("read object");
    System.out.println(o);

    // Introduced unreachable while loop
    boolean conditionWhile = getStaticCondition();
    while (conditionWhile) {
      // This loop is unreachable because getStaticCondition() always returns false
    }
  }

  private static boolean getStaticCondition() {
    return false;
  }
}