import junit.framework.TestCase;

class Ideas_2011_04_24 extends TestCase {

  public double getDouble() {
    return 17.0;
  }

  public int getInt() {
    return 42;
  }

  public String getFoo() {
    return "Foo";
  }

  public boolean b(String s) {
    return s.length() == 0 || s == null;
  }

  public void testBusted() {
    // Inserting an unreachable while loop
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
      // Unreachable code
      System.out.println("This is an unreachable loop");
    }

    assertSame(17, getDouble());
    assertEquals(42.0, getDouble());
    assertEquals(17, getDouble());
    assertEquals(42.0, getInt());
    assertEquals(42, getFoo());
    assertEquals(42.0, getFoo());
  }

  private boolean getCondition() {
    return false; // This method ensures the condition is dynamically determined but returns false
  }
}