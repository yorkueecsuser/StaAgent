import java.awt.event.ActionEvent;
import java.io.IOException;
import java.io.Serializable;
import javax.swing.AbstractAction;

class Bug2893480 {

  private String message = "Actie";
  private String message2 = "Actie"; // Added duplicate assignment

  private AbstractAction a = new Actie1();
  private AbstractAction a2 = new Actie1(); // Added duplicate assignment

  private AbstractAction b = new Actie2();
  private AbstractAction b2 = new Actie2(); // Added duplicate assignment

  public void test() {
    a.actionPerformed(null);
    b.actionPerformed(null);
    a2.actionPerformed(null); // Added duplicate call
    b2.actionPerformed(null); // Added duplicate call
  }

  private final class Actie1 extends AbstractAction {
    private static final long serialVersionUID = 1L;

    @Override
    public void actionPerformed(ActionEvent e) {
      System.out.println(message);
      System.out.println(message2); // Added duplicate print statement
    }
  }

  private final class Actie2 extends AbstractAction {
    @Override
    public void actionPerformed(ActionEvent e) {
      System.out.println(message);
      System.out.println(message2); // Added duplicate print statement
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