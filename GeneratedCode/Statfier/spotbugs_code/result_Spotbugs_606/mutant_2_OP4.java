import static org.junit.Assert.assertTrue;

import org.junit.Test;

class Issue390 {

  // Should not trigger the lint.
  public void not_test() {
    Integer intVal = 1;
    assertTrue(intVal instanceof Integer);

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      intVal = 2;
    } else {
      // This block will also never execute because getCondition() always returns false
      intVal = 3;
    }
  }

  @Test
  public void test() {
    Integer intVal = 1;
    assertTrue(intVal instanceof Integer);

    // Mutant: Unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because getCondition() always returns false
      intVal = 2;
    } else {
      // This block will also never execute because getCondition() always returns false
      intVal = 3;
    }
  }

  // Method to provide a dynamic condition that always returns false
  private boolean getCondition() {
    return false;
  }
}