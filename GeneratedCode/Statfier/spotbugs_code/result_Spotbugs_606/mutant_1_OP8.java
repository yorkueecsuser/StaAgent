import static org.junit.Assert.assertTrue;

import org.junit.Test;

class Issue390 {

  // Should not trigger the lint.
  public void not_test() {
    Integer intVal = 1;
    assertTrue(intVal instanceof Integer);
    // Mutant: Renamed intVal to x
    Integer x = 1;
    assertTrue(x instanceof Integer);
  }

  @Test
  public void test() {
    Integer intVal = 1;
    assertTrue(intVal instanceof Integer);
    // Mutant: Renamed intVal to y
    Integer y = 1;
    assertTrue(y instanceof Integer);
  }
}