import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SuperRI implements ActionListener, Cloneable {
  @Override
  public void actionPerformed(ActionEvent ae) {
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // Some code here
    } else {
      // Unreachable else block
    }
  }

  private boolean getCondition() {
    return true; // Always returns true to ensure the else block is unreachable
  }
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