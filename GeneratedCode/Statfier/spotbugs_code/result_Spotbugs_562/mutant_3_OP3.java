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
      System.out.println(message);
      // Mutant code: Inserting unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement in Actie1");
      }
    }

    private boolean getCondition() {
      return false;
    }
  }

  private final class Actie2 extends AbstractAction {
    @Override
    public void actionPerformed(ActionEvent e) {
      System.out.println(message);
      // Mutant code: Inserting unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement in Actie2");
      }
    }

    private boolean getCondition() {
      return false;
    }
  }

  private final class Actie3 extends AbstractAction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public void actionPerformed(ActionEvent e) {
      System.out.println(message);
      // Mutant code: Inserting unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement in Actie3");
      }
    }

    private boolean getCondition() {
      return false;
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
      // Mutant code: Inserting unreachable if branch
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement in Actie4");
      }
    }

    private boolean getCondition() {
      return false;
    }
  }
}