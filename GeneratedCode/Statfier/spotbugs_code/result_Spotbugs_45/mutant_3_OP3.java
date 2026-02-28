import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SuperRI implements ActionListener, Cloneable {
  @Override
  public void actionPerformed(ActionEvent ae) {}

  // Introduced an unreachable if statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is reachable code.");
    }
    // Unreachable if statement
    boolean unreachableCondition = getUnreachableCondition();
    if (unreachableCondition) {
      System.out.println("This is unreachable code.");
    }
  }

  private boolean getCondition() {
    return true;
  }

  private boolean getUnreachableCondition() {
    return false;
  }
}

// This is fine
class Sub extends SuperRI {}

// This is redundant
class RI extends SuperRI implements ActionListener {
  public static void main(String[] args) {
    RI ri = new RI();
    ri.actionPerformed(new ActionEvent(ri, 0, "Yo"));
    ri.someMethod(); // Call to see the unreachable if statement in action
  }
}