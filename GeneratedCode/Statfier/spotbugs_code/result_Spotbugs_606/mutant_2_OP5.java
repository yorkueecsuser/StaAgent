import static org.junit.Assert.assertTrue;

import org.junit.Test;

class Issue390 {

  // Should not trigger the lint.
  public void not_test() {
    Integer intVal = 1;
    assertTrue(intVal instanceof Integer);

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case");
        break;
    }
  }

  @Test
  public void test() {
    Integer intVal = 1;
    assertTrue(intVal instanceof Integer);

    // Inserting an unreachable switch statement
    boolean condition = getCondition();
    switch (getValue(condition)) {
      case 1:
        System.out.println("This is unreachable");
        break;
      default:
        System.out.println("Default case");
        break;
    }
  }

  private boolean getCondition() {
    return false; // This will ensure the switch is unreachable
  }

  private int getValue(boolean condition) {
    if (condition) {
      return 1;
    } else {
      return 0;
    }
  }
}