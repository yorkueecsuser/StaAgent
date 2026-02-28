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

  public int getIntr() {
    return 42;
  }

  public String getFoos() {
    return "Foo";
  }

  public boolean bx(String x) {
    return x.length() == 0 || x == null;
  }

  public void testBustedx() {
    assertSame(17, getDoublex());
    assertEquals(42.0, getDoublex());
    assertEquals(17, getDoublex());
    assertEquals(42.0, getIntr());
    assertEquals(42, getFoos());
    assertEquals(42.0, getFoos());
  }
}