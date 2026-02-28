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

  // Mutated code
  private String x = "Actie";

  private AbstractAction c = new Actie1();

  private AbstractAction d = new Actie2();

  public void y() {
    c.actionPerformed(null);
    d.actionPerformed(null);
  }

  private final class Actie5 extends AbstractAction {
    private static final long serialVersionUID = 1L;

    @Override
    public void actionPerformed(ActionEvent f) {
      System.out.println(x);
    }
  }

  private final class Actie6 extends AbstractAction {
    @Override
    public void actionPerformed(ActionEvent f) {
      System.out.println(x);
    }
  }

  private final class Actie7 extends AbstractAction implements Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public void actionPerformed(ActionEvent f) {
      System.out.println(x);
    }
  }

  private final class Actie8 extends AbstractAction {
    private void readObject(java.io.ObjectInputStream g)
        throws IOException, ClassNotFoundException {
      g.defaultReadObject();
    }

    @Override
    public void actionPerformed(ActionEvent f) {
      System.out.println(x);
    }
  }
}