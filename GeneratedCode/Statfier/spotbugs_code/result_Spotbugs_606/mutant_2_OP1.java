import static org.junit.Assert.assertTrue;

import org.junit.Test;

class Issue390 {

  // Should not trigger the lint.
  public void not_test() {
    Integer intVal = 1;
    assertTrue(intVal instanceof Integer);
    // Dead Store Mutation
    String qjvhtybz = "unused";
  }

  @Test
  public void test() {
    Integer intVal = 1;
    assertTrue(intVal instanceof Integer);
    // Dead Store Mutation
    int xkmbpflr = 42;
  }
}