import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SuperRI implements ActionListener, Cloneable {
  @Override
  public void actionPerformed(ActionEvent ae) {}

  // Introduced unreachable if statement
  public void someMethod() {
    boolean condition = getCondition();
    if (condition) {
      // Some code that will never be executed
      System.out.println("This is an unreachable statement");
    }
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
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

  // Introduced unreachable if statement
  public void anotherMethod() {
    boolean condition = getAnotherCondition();
    if (condition) {
      // Some code that will never be executed
      System.out.println("This is another unreachable statement");
    }
  }

  private boolean getAnotherCondition() {
    return false; // This method ensures the condition is dynamically determined at runtime
  }
}