import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SuperRI implements ActionListener, Cloneable {
  @Override
  public void actionPerformed(ActionEvent ae) {
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // Unreachable loop body
    }
  }

  private boolean getCondition() {
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
    boolean conditionForMain = getConditionMain();
    for (int i = 0; conditionForMain; i++) {
      // Unreachable loop body
    }
  }

  private static boolean getConditionMain() {
    return false;
  }
}