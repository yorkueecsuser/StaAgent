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
              public void actionPerformed(ActionEvent ae) {
                // Introduced an unreachable if statement
                boolean condition = getCondition();
                if (condition) {
                  System.out.println("This is an unreachable statement");
                }
              }
            });
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

    // Introduced an unreachable if statement
    boolean conditionMain = getConditionMain();
    if (conditionMain) {
      System.out.println("This is another unreachable statement in main");
    }
  }

  private static boolean getConditionMain() {
    return false;
  }
}