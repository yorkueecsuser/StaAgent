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
  }

  private final class Actie1 extends AbstractAction {
    private static final long serialVersionUID = 1L;

    @Override
    public void actionPerformed(ActionEvent e) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This is a reachable statement.");
      } else {
        // Unreachable if-else statement
        System.out.println("This is an unreachable statement.");
      }
      System.out.println(message);
    }
  }

  private final class Actie2 extends AbstractAction {
    @Override
    public void actionPerformed(ActionEvent e) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This is a reachable statement.");
      } else {
        // Unreachable if-else statement
        System.out.println("This is an unreachable statement.");
      }
      System.out.println(message);
    }
  }

  private final class Actie3 extends AbstractAction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public void actionPerformed(ActionEvent e) {
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This is a reachable statement.");
      } else {
        // Unreachable if-else statement
        System.out.println("This is an unreachable statement.");
      }
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
      boolean shouldRun = getCondition();
      if (shouldRun) {
        System.out.println("This is a reachable statement.");
      } else {
        // Unreachable if-else statement
        System.out.println("This is an unreachable statement.");
      }
      System.out.println(message);
    }
  }

  private boolean getCondition() {
    return true; // This ensures the condition is always true, making the else branch unreachable
  }
}