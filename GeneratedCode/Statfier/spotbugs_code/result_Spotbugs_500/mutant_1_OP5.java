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

    // Inserting unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case is always executed
        System.out.println("Reachable case 1");
        break;
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the switch statement's first case unreachable
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

    // Inserting unreachable switch statement
    boolean condition = getStaticCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("Unreachable case 0");
        break;
      case 1:
        // This case is always executed
        System.out.println("Reachable case 1");
        break;
    }
  }

  private static boolean getStaticCondition() {
    // This method always returns false, making the switch statement's first case unreachable
    return false;
  }
}