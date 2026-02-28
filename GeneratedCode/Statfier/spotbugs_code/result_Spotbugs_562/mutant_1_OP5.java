import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.Serializable;
import javax.swing.AbstractAction;

class Bug2893480 {

  private String message = "Actie";

  private AbstractAction a = new Actie1();

  private AbstractAction b = new Actie2();

  public void test() {
    a.actionPerformed(null);
    b.actionPerformed(null);

    // Introduced unreachable switch statement
    boolean condition = getCondition();
    switch (condition? 0 : 1) {
      case 0:
        // This case is unreachable because condition is never true
        System.out.println("This is an unreachable case");
        break;
      default:
        // Default case to ensure the switch is not empty
        break;
    }
  }

  private final class Actie1 extends AbstractAction {
    private static final long serialVersionUID = 1L;

    @Override
    public void actionPerformed(ActionEvent e) {
      System.out.println(message);
    }
  }

  private final class Actie2 extends AbstractAction {
    @Override
    public void actionPerformed(ActionEvent e) {
      System.out.println(message);
    }
  }

  private final class Actie3 extends AbstractAction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public void actionPerformed(ActionEvent e) {
      System.out.println(message);
    }
  }

  private final class Actie4 extends AbstractAction {
    private void readObject(java.io.ObjectInputStream in)
        throws IOException, ClassNotFoundException {
      in.defaultReadObject();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      System.out.println(message);
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This ensures the condition is always false, making the switch statement unreachable
  }
}