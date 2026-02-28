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

    // Inserted unreachable if-else statement
    boolean shouldRun = getCondition();
    if (shouldRun) {
      // This block will never execute because shouldRun is always false
      System.out.println("This is an unreachable block");
    } else {
      // This block will also never execute because shouldRun is always false
      System.out.println("This is another unreachable block");
    }
  }

  private boolean getCondition() {
    // This method always returns false, making the if-else block unreachable
    return false;
  }
}