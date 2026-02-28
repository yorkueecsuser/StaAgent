import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SuperRI implements ActionListener, Cloneable {
  @Override
  public void actionPerformed(ActionEvent ae) {}
}

// This is fine
class Sub extends SuperRI {}

// This is redundant
class RI extends SuperRI implements ActionListener {
  public static void main(String[] args) {
    RI ri = new RI();
    ri.actionPerformed(new ActionEvent(ri, 0, "Yo"));
  }
}

// Mutated code
class SuperRI implements ActionListener, Cloneable {
  @Override
  public void actionPerformed(ActionEvent b) {}
}

// This is fine
class Sub extends SuperRI {}

// This is redundant
class RI extends SuperRI implements ActionListener {
  public static void main(String[] args) {
    RI c = new RI();
    c.actionPerformed(new ActionEvent(c, 0, "Yo"));
  }
}