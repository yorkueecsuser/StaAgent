import static org.junit.Assert.assertTrue;

import org.junit.Test;

class Issue390 {

  // Should not trigger the lint.
  public void not_test() {
    Integer intVal = 1;
    assertTrue(intVal instanceof Integer);
    // Mutant
    Integer a = 1;
    assertTrue(a instanceof Integer);
  }

  @Test
  public void test() {
    Integer intVal = 1;
    assertTrue(intVal instanceof Integer);
    // Mutant
    Integer b = 1;
    assertTrue(b instanceof Integer);
  }
}