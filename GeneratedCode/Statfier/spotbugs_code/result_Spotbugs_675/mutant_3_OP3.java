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
    assertSame(17, getDouble());
    assertEquals(42.0, getDouble());
    assertEquals(17, getDouble());
    assertEquals(42.0, getInt());
    assertEquals(42, getFoo());
    assertEquals(42.0, getFoo());

    // Inserting an unreachable if statement
    boolean condition = getCondition();
    if (condition) {
      System.out.println("This is an unreachable statement");
    }
  }

  // Method to provide a dynamic condition
  private boolean getCondition() {
    return false; // This method always returns false, making the if statement unreachable
  }
}