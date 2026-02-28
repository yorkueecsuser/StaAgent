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
    int test = 5; // Introduced for mutation purposes
    int test = 5; // Duplicate of the above assignment statement
    ri.actionPerformed(new ActionEvent(ri, 0, "Yo"));
  }
}