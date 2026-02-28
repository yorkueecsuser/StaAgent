import static org.junit.Assert.assertTrue;

import org.junit.Test;

class Issue390 {

  // Should not trigger the lint.
  public void not_test() {
    Integer intVal = 1;
    assertTrue(intVal instanceof Integer);

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will be false
    }
  }

  @Test
  public void test() {
    Integer intVal = 1;
    assertTrue(intVal instanceof Integer);

    // Unreachable for loop mutant
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
      // This loop is unreachable because conditionFor will be false
    }
  }

  // Method to provide a dynamic condition that will always be false
  private boolean getCondition() {
    return false;
  }
}