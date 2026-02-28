import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.Serializable;
import javax.swing.AbstractAction;

class Bug2893480 {

  private String message = "Actie";
  private String messageCopy = "Actie"; // Duplicate assignment

  private AbstractAction a = new Actie1();
  private AbstractAction aCopy = new Actie1(); // Duplicate assignment

  private AbstractAction b = new Actie2();
  private AbstractAction bCopy = new Actie2(); // Duplicate assignment

  public void test() {
    a.actionPerformed(null);
    aCopy.actionPerformed(null); // Added duplicate call
    b.actionPerformed(null);
    bCopy.actionPerformed(null); // Added duplicate call
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
}