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
  }

  // Mutated code
  public double getDoublex() {
    return 17.0;
  }

  public int getIntx() {
    return 42;
  }

  public String getFox() {
    return "Foo";
  }

  public boolean bx(String s) {
    return s.length() == 0 || s == null;
  }

  public void testBustedx() {
    assertSame(17, getDoublex());
    assertEquals(42.0, getDoublex());
    assertEquals(17, getDoublex());
    assertEquals(42.0, getIntx());
    assertEquals(42, getFox());
    assertEquals(42.0, getFox());
  }
}